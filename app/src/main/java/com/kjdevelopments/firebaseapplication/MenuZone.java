package com.kjdevelopments.firebaseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MenuZone extends Activity {

    Button btInsert, btDelete, btUpdate, btShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_zone);

        btInsert = findViewById(R.id.btInsert);
        btDelete = findViewById(R.id.btDelete);
        btUpdate = findViewById(R.id.btUpdate);
        btShow = findViewById(R.id.btShow);

        btShow.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), ShowData.class);
            startActivity(intent);
        });

        btDelete.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), DeleteData.class);
            startActivity(intent);
        });

        btUpdate.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), UpdateUser.class);
            startActivity(intent);
        });
    }
}