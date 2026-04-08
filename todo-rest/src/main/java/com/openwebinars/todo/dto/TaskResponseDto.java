package com.openwebinars.todo.dto;

import com.openwebinars.todo.model.Task;
import com.openwebinars.todo.users.UserRegistrationResponseDto;

import java.time.LocalDateTime;

public record TaskResponseDto(
        Long id,
        String title,
        String description,
        LocalDateTime createdAt,
        LocalDateTime deadline,
        UserRegistrationResponseDto author){

    public static TaskResponseDto toDto(Task task) {
        return new TaskResponseDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getCreatedAt(),
                task.getDeadline(),
                UserRegistrationResponseDto.toDto(task.getAuthor())
        );
    }

}
