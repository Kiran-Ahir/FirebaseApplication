package com.kjdevelopments.firebaseapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ShowData extends Activity {

    ListView lv;

    DatabaseReference dbRef;

    ArrayList<User> userArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        lv = findViewById(R.id.lv);

        dbRef = FirebaseDatabase.getInstance().getReference("user");

        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                userArrayList.clear();

                for (DataSnapshot snap : snapshot.getChildren()) {

                    User u1 = snap.getValue(User.class);

                    userArrayList.add(u1);
                }

                ArrayAdapter<User> arrayAdapter = new ArrayAdapter<User>(getApplicationContext(),
                                                                            android.R.layout.simple_list_item_1,
                                                                            userArrayList);

                lv.setAdapter(arrayAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}