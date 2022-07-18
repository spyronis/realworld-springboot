package io.zoooohs.realworld.domain.user.controller;

import io.zoooohs.realworld.domain.user.dto.UserDto;
import io.zoooohs.realworld.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {
    private final UserService userService;

    @PostMapping
    public UserDto registration(@RequestBody @Valid UserDto.Registration registration) {
        return userService.registration(registration);
    }

    @PostMapping("/login")
    public UserDto login(@RequestBody @Valid UserDto.Login login) {
        return userService.login(login);
    }
}
