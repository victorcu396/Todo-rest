package com.openwebinars.todo.users;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/auth/register")
    public ResponseEntity<UserRegistrationResponseDto> createUser(@RequestBody CreateUserRequestDto createUserRequest) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(UserRegistrationResponseDto.toDto(userService.register(createUserRequest)));
    }

}
