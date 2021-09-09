package com.pivot.pivotDeals;

public class User {
    public int id;
    private String username;
    private String password;
    public Location location;
    public int age;

    public User(int id, String username,  Location location) {
        this.id = id;
        this.username = username;
        this.location = location;

    }

    public User() {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public String getUsername(){
        return this.username;
    }
    public void setId(){
        this.id = id;
    }
    public void setUsername(){
        this.username = username;
    }

//    public User(){
//        this.id = 1;
//        this.lastname = "Hawkins";
//        this.username = "JamalH97";
//        this.password = "******";
//        this.age = 24;
//
//
//    }
//    public User(int id,String lastname, String username,String password,int age){
//        this.id = id;
//        this.lastname = lastname;
//        this.username = username;
//        this.password = password;
//        this.age = age;
//
//    }

}
