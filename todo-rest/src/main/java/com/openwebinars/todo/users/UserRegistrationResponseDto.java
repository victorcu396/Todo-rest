package com.openwebinars.todo.users;

public record UserRegistrationResponseDto(Long id, String username, String email) {

    public static UserRegistrationResponseDto toDto(User user) {
        return new UserRegistrationResponseDto(
                user.getId(),
                user.getUsername(),
                user.getEmail()
        );
    }

}
