package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoEntryController {

    @GetMapping("/todos")
    public List<TodoEntry> getTodos() {
        return List.of(new TodoEntry("M1"), new TodoEntry("M2"),new TodoEntry("M3"));
    }

}
