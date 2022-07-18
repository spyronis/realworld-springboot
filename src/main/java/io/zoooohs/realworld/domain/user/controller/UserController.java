package io.zoooohs.realworld.domain.user.controller;

import io.zoooohs.realworld.domain.user.dto.UserDto;
import io.zoooohs.realworld.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public UserDto currentUser(@AuthenticationPrincipal UserDto.Auth authUser) {
        return userService.currentUser(authUser);
    }

    @PutMapping
    public UserDto update(@Valid @RequestBody UserDto.Update update, @AuthenticationPrincipal UserDto.Auth authUser) {
        return userService.update(update, authUser);
    }
}
