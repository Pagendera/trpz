package com.example.terminal.web;

import com.example.terminal.service.TerminalSettingService;
import com.example.terminal.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService service;
    private final TerminalSettingService terminalSettingService;

}