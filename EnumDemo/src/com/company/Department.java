package com.company;

public enum Department {
    CS("Jack", "BLock A"), IT("John", "Block C");
    String head;
    String location;

    Department(String head, String location) {
        this.head = head;
        this.location = location;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
