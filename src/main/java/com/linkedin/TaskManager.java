package com.linkedin;

import java.util.HashMap;
import java.util.Map;

public class TaskManager {

    private Map<Integer, Task> tasks;

    public TaskManager(){
        this.tasks = new HashMap<>();
    }

    public void add( Task task){
        this.tasks.put(task.getId(),task);
    }

    public void remove(int taskId){
        this.tasks.remove(taskId);
    }

    public boolean exist(int taskId){
        return this.tasks.containsKey(taskId);
    }

    public int getCount(){
        return tasks.size();
    }
    
}
