package com.linkedin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TaskManagerTest 
{
    /**
     * Rigorous Test :-)
     */

     private static TaskManager taskManager;
     private Task task;
     @BeforeEach
     public void setup(){
        taskManager = new TaskManager();
        task = new Task("Read a book");
        assertEquals(0, taskManager.getCount());
     }

    @Test
    public void addTask()
    {
        
        taskManager.add(task);

        assertTrue(taskManager.exist(task.getId()));
        assertEquals(1, taskManager.getCount());
    }

    @Test 

    public void addTask_DuplicateTask(){
        
        Task task1 = new Task("Clean the Kitchen");
     
        taskManager.add(task);

        taskManager.add(task1);

        assertTrue(taskManager.exist(task.getId()));
        assertTrue(taskManager.exist(task1.getId()));
    

        assertEquals(2, taskManager.getCount());

    }

    @Test
    public void removeTask(){
        
        taskManager.add(task);
        int prevTaskCount = taskManager.getCount();
        taskManager.remove(task.getId());

        assertFalse(taskManager.exist(task.getId()));
        assertEquals(prevTaskCount-1 , taskManager.getCount());
    }


}
