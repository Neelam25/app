package com.linkedin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskTest {


    public static Task task;
    public final String DESCRIPTION="Write an Article";
    
    @BeforeEach
    public void setup(){
        task = new Task(DESCRIPTION);
    }
    
    @Test
    public void getId(){
       assertNotNull(task.getId());
    }

    @Test
    public void getDescription(){
       String result = task.getDescription();
        assertEquals(DESCRIPTION, result);
    }

    @Test
    public void setDescription(){

        task.setDescription(DESCRIPTION+"this year");
        assertEquals(DESCRIPTION+"this year", task.getDescription());
    }
}
