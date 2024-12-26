package com.example.terminal.service;

public interface TerminalService {
    void configureTerminal(int width, int height, String bgColor, String code);

    void executePowerShellCommand(String command);
}
