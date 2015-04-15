package com.domain;

/**
 * Created by Shixuan on 2015/4/13.
 */
public class Message {

    private final long  id;
    private final String message;

    public Message(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
