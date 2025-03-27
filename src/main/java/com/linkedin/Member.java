package com.linkedin;

public class Member {
    private String memeberId;
    private String name;

    public Member(String memeberId, String name){
        this.memeberId = memeberId;
        this.name = name;
    }

    public String getMemberId(){
        return memeberId;
    }

    public String getName() {
        return name;
    }

}
