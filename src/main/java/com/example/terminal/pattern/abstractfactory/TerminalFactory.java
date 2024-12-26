package com.example.terminal.pattern.abstractfactory;

public interface TerminalFactory {
    TerminalWindow createTerminalWindow();
    SyntaxHighlighter createSyntaxHighlighter();
    CommandExecutor createCommandExecutor();
}