package com.example.terminal.pattern.command;

public class TerminalInvoker {
    private TerminalCommand command;

    public TerminalInvoker() {
    }

    public void setCommand(TerminalCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}