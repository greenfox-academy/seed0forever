package com.greenfoxacademy.seed0forever.p2p_chat.model.rest;

public class ChatClient {

    // CHAT_APP_UNIQUE_ID of the message sender client app
    private String id;

    public ChatClient() {
    }

    public ChatClient(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ChatClient{" +
                "id='" + id + '\'' +
                '}';
    }
}
