package com.example.terminal.pattern.abstractfactory;

public abstract class TerminalApp implements TerminalFactory {
    private TerminalFactory terminalFactory;
    private TerminalWindow terminalWindow;
    private SyntaxHighlighter syntaxHighlighter;
    private CommandExecutor commandExecutor;

    public TerminalApp(TerminalFactory terminalFactory) {
        this.terminalFactory = terminalFactory;
        terminalWindow = terminalFactory.createTerminalWindow();
        syntaxHighlighter = terminalFactory.createSyntaxHighlighter();
        commandExecutor = terminalFactory.createCommandExecutor();
    }

    public void configureTerminal(int width, int height, String bgColor, String code) {
        terminalWindow.setWindowSize(width, height);
        terminalWindow.setBackgroundColor(bgColor);
        terminalWindow.display();
        syntaxHighlighter.highlightSyntax(code);
    }

    public void executePowerShellCommand(String command) {
        commandExecutor.executeCommand(command);
    }
}