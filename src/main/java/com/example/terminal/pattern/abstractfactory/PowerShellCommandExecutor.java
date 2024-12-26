package com.example.terminal.pattern.abstractfactory;

public class PowerShellCommandExecutor implements CommandExecutor {
    @Override
    public void executeCommand(String command) {
        System.out.println("Executing PowerShell command: " + command);
    }
}