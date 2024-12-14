package com.example.terminal.web;

import com.example.terminal.service.TerminalSettingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/terminal")
@AllArgsConstructor
public class TerminalController {
    private final TerminalSettingService service;

}