package com.example.terminal.pattern.abstractfactory;

public class LightThemeTerminalFactory implements TerminalFactory {
    @Override
    public TerminalWindow createTerminalWindow() {
        return new LightThemeTerminalWindow();
    }

    @Override
    public SyntaxHighlighter createSyntaxHighlighter() {
        return new LightThemeSyntaxHighlighter();
    }

    @Override
    public CommandExecutor createCommandExecutor() {
        return new PowerShellCommandExecutor();
    }
}