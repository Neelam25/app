package com.linkedin;

/**
 * Hello world!
 *
 */
public class Task 
{
    
    private static int counter;
    private Integer id;

    public Task(){
        this.id = counter++;
    }

    public Integer getId(){
        return id;
    }
}
