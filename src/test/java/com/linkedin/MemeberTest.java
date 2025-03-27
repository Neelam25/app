package com.linkedin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MemeberTest {

    @Test
    public void getMemberfields(){
        String memberId ="M101";
        String name ="John";

        Member member = new Member(memberId, name);

        assertEquals(memberId, member.getMemberId());
        assertEquals(name, member.getName());
    }

}
