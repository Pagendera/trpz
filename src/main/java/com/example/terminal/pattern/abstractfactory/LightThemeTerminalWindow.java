package com.example.terminal.pattern.abstractfactory;

public class LightThemeTerminalWindow implements TerminalWindow {
    @Override
    public void setWindowSize(int width, int height) {
        System.out.println("Setting light theme terminal window size to " + width + "x" + height);
    }

    @Override
    public void setBackgroundColor(String color) {
        System.out.println("Setting background color to " + color);
    }

    @Override
    public void display() {
        System.out.println("Displaying light theme terminal window");
    }
}