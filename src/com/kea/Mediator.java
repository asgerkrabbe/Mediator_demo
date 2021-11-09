package com.kea;

import java.util.HashMap;
import java.util.List;

class Mediator {
    // 4. The Mediator arbitrates

    public void sendMsg(String msg, String username) {

    }

    public void receiveMsg(String msg, String username) {

    }

    public void msgQueue(String msg, String username) {
        HashMap<String, String> message = new HashMap<>();


        message.put(username, msg);
    }
}