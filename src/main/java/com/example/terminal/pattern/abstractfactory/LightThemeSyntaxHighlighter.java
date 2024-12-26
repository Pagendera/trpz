package com.example.terminal.pattern.abstractfactory;

public class LightThemeSyntaxHighlighter implements SyntaxHighlighter {
    @Override
    public void highlightSyntax(String code) {
        System.out.println("Highlighting syntax in light theme: " + code);
    }
}