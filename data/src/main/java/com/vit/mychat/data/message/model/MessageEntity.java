package com.vit.mychat.data.message.model;

public class MessageEntity {

    private String message;
    private String from;
    private boolean seen;
    private long time;
    private String type;

    public MessageEntity() {
    }

    public MessageEntity(String message, String from, boolean seen, long time, String type) {
        this.message = message;
        this.from = from;
        this.seen = seen;
        this.time = time;
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
