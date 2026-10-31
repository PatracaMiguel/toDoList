package com.example.demo.exception;

import java.util.UUID;

public class TaskNotFoundException extends RuntimeException {
    private final UUID id;

    public TaskNotFoundException(UUID id) {
        super(String.format("Task with ID '%s' does not exist.", id));
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public UUID getTaskId() {
        return id;
    }

}
