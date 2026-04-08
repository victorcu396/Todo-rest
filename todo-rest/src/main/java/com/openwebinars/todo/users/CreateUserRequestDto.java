package com.openwebinars.todo.users;

public record CreateUserRequestDto(String username, String email, String password) {
}
