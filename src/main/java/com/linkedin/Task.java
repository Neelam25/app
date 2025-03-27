package com.linkedin;

/**
 * Hello world!
 *
 */
public class Task 
{
    
    private static int counter;
    private Integer id;
    private String description;

    public Task(String description){
        this.id = counter++;
        this.description = description;
    }

    public Integer getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
