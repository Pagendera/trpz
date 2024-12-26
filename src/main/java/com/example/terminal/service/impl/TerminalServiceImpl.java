package com.example.terminal.service.impl;

import com.example.terminal.pattern.abstractfactory.CommandExecutor;
import com.example.terminal.pattern.abstractfactory.SyntaxHighlighter;
import com.example.terminal.pattern.abstractfactory.TerminalFactory;
import com.example.terminal.pattern.abstractfactory.TerminalWindow;

public class TerminalServiceImpl {
    private TerminalFactory terminalFactory;

    public TerminalServiceImpl(TerminalFactory terminalFactory) {
        this.terminalFactory = terminalFactory;
    }

    public void setTerminalFactory(TerminalFactory terminalFactory) {
        this.terminalFactory = terminalFactory;
    }

    public void configureTerminal(int width, int height, String bgColor, String code) {
        TerminalWindow terminalWindow = terminalFactory.createTerminalWindow();
        SyntaxHighlighter syntaxHighlighter = terminalFactory.createSyntaxHighlighter();

        terminalWindow.setWindowSize(width, height);
        terminalWindow.setBackgroundColor(bgColor);
        terminalWindow.display();
        syntaxHighlighter.highlightSyntax(code);
    }

    public void executePowerShellCommand(String command) {
        CommandExecutor commandExecutor = terminalFactory.createCommandExecutor();
        commandExecutor.executeCommand(command);
    }
}