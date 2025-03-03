package com.linkedin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TaskManagerTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void addTask()
    {
        TaskManager taskManager = new TaskManager();
        Task task = new Task();

        taskManager.add(task);

        assertTrue(taskManager.exist(task.getId()));

        //assertTrue( true );
    }

    @Test 

    public void addTask_DuplicateTask(){
        TaskManager taskManager = new TaskManager();
        Task task1 = new Task();
        Task task2 = new Task();

        taskManager.add(task1);
        taskManager.add(task2);

        assertTrue(taskManager.exist(task1.getId()));
        assertTrue(taskManager.exist(task2.getId()));

        assertEquals(2, taskManager.getCount());

    }

    @Test
    public void removeTask(){
        TaskManager taskManager = new TaskManager();
        Task task = new Task();

        taskManager.add(task);
        int prevTaskCount = taskManager.getCount();
        taskManager.remove(task.getId());

        assertFalse(taskManager.exist(task.getId()));
        assertEquals(prevTaskCount-1 , taskManager.getCount());
    }
}
