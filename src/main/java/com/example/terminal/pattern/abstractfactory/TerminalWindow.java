package com.example.terminal.pattern.abstractfactory;

public interface TerminalWindow {
    void setWindowSize(int width, int height);
    void setBackgroundColor(String color);
    void display();
}