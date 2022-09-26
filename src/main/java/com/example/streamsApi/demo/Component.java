package com.example.streamsApi.demo;

public interface Component {
    void printDescription() ;
    void addChild(Component c);
    void removeChild(Component c);
    Component getChild(int i);
}
