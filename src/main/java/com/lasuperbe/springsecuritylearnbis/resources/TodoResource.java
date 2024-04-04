package com.lasuperbe.springsecuritylearnbis.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.logging.Logger;

@RestController
public class TodoResource {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private static final List<Todo> TODO_LIST = List.of(
            new Todo("in28minutes", "Learn aws"),
            new Todo("in28minutes", "learn azure")
    );

    @GetMapping("/todos")
    public List<Todo> retrieveAllTodos(){
        return TODO_LIST;
    }

    @GetMapping("/users/{username}/todos")
    public Todo retrieveTodosForSpecificUser(@PathVariable String username){

        return TODO_LIST.get(0);
    }

    @PostMapping("/users/{username}/todos")
    public void createTodoForSpecificUser(@PathVariable String username, @RequestBody Todo todo){

        logger.info("Creating {} for {}", todo, username);
//        return TODO_LIST.get(0);
    }
}

record Todo(String username, String description){}
