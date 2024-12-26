package com.example.terminal.pattern.abstractfactory;

public class DarkThemeTerminalFactory implements TerminalFactory {
    @Override
    public TerminalWindow createTerminalWindow() {
        return new DarkThemeTerminalWindow();
    }

    @Override
    public SyntaxHighlighter createSyntaxHighlighter() {
        return new DarkThemeSyntaxHighlighter();
    }

    @Override
    public CommandExecutor createCommandExecutor() {
        return new PowerShellCommandExecutor();
    }
}