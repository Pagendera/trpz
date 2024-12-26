package com.example.terminal.web;

import com.example.terminal.model.Terminal;
import com.example.terminal.pattern.command.ChangeColorCommand;
import com.example.terminal.pattern.command.ResizeWindowCommand;
import com.example.terminal.pattern.command.TerminalCommand;
import com.example.terminal.pattern.command.TerminalInvoker;
import com.example.terminal.service.TerminalSettingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/terminal")
@AllArgsConstructor
public class TerminalController {
    private final Terminal terminal;
    private final TerminalInvoker invoker;

    @GetMapping("/execute/{command}")
    public String executeCommand(@PathVariable String command) {
        terminal.executeCommand(command);
        return "Command executed: " + command;
    }

    @PostMapping("/changeColor/{color}")
    public String changeColor(@PathVariable String color) {
        TerminalCommand command = new ChangeColorCommand(color);
        invoker.setCommand(command);
        invoker.executeCommand();
        return "Color command executed";
    }

    @PostMapping("/resizeWindow/{width}/{height}")
    public String resizeWindow(@PathVariable int width, @PathVariable int height) {
        TerminalCommand command = new ResizeWindowCommand(width, height);
        invoker.setCommand(command);
        invoker.executeCommand();
        return "Resize command executed";
    }
}