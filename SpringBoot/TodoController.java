package com.example.demo.controller;

import com.example.demo.model.Todo;
import com.example.demo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getAllTodos()
    {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable Long id)
    {
        return todoService.getTodoById(id);
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo)
    {
        return todoService.addToDo(todo);
    }

    @DeleteMapping("{id}")
    public String deleteTodoById(@PathVariable Long id)
    {
        boolean deleted = todoService.deleteTodoById(id);
        return deleted ? "Todo deleted" : "Todo not found";
    }

}
