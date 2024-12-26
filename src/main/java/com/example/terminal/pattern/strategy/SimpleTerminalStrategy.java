package com.example.terminal.pattern.strategy;

public class SimpleTerminalStrategy implements TerminalStrategy {
    @Override
    public void executeCommand(String command) {
        System.out.println("Виконано просту команду: " + command);
    }
}
