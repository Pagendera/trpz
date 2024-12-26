package com.example.terminal.pattern.abstractfactory;

public class DarkThemeSyntaxHighlighter implements SyntaxHighlighter {
    @Override
    public void highlightSyntax(String code) {
        System.out.println("Highlighting syntax in dark theme: " + code);
    }
}