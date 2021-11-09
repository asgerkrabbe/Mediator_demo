package com.kea;

public class User {
    String name;
    int id;
    Mediator mediator;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void sendMsg(String msg, String name) {
        mediator.sendMsg(msg, name);
    }


}
