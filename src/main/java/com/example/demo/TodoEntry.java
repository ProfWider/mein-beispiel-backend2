package com.example.demo;

public class TodoEntry {

    public TodoEntry() {}
    public TodoEntry(String title) {
        this.title = title;
    }

    private String title;
    private String description;

    @Override
    public String toString() {
        return "TodoEntry{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
