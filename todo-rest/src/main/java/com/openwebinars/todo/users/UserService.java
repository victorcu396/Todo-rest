package com.openwebinars.todo.users;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User register(CreateUserRequestDto createUserRequest) {
        User user = User.builder()
                .username(createUserRequest.username())
                .email(createUserRequest.email())
                .password(passwordEncoder.encode(createUserRequest.password()))
                .isAdmin(false)
                .build();
        return userRepository.save(user);
    }



}
