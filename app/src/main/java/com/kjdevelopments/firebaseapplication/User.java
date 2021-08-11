package com.kjdevelopments.firebaseapplication;


import androidx.annotation.NonNull;

//  model, pojo, bean
public class User {

    String uid;
    String name;
    String mobile;
    String email;
    String password;

    public User() {
    }

    public User(String uid, String name, String mobile, String email, String password) {
        this.uid = uid;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
    }

    @NonNull
    @Override
    public String toString() {
        return "Name: "+name+", Mobile: "+mobile;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
