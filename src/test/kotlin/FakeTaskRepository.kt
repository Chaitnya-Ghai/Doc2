package com.example

import com.example.model.Priority
import com.example.model.Task
import com.example.model.TaskRepository

class FakeTaskRepository : TaskRepository {
    override suspend fun allTasks(): List<Task> {
        TODO("Not yet implemented")
    }

    override suspend fun tasksByPriority(priority: Priority): List<Task> {
        TODO("Not yet implemented")
    }

    override suspend fun taskByName(name: String): Task? {
        TODO("Not yet implemented")
    }

    override suspend fun addTask(task: Task) {
        TODO("Not yet implemented")
    }

    override suspend fun removeTask(name: String): Boolean {
        TODO("Not yet implemented")
    }

}