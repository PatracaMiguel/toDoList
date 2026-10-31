package com.example.demo.domain.dto;

import com.example.demo.domain.entity.TaskPriority;
import com.example.demo.domain.entity.TaskStatus;
import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority,
        TaskStatus status) {

}
