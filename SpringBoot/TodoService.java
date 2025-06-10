package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.*;
import java.util.*;

@Service
public class TodoService {

    private final Map<Long, Todo> todos = new HashMap<>();
    private long currentId = 1;

    public List<Todo> getAllTodos()
    {
        return new ArrayList<>(todos.values());
    }

    public Todo getTodoById(Long id)
    {
        return todos.get(id);
    }

    public Todo addToDo(Todo todo)
    {
        todo.setId(currentId++);
        todos.put(todo.getId(), todo);
        return todo;
    }

    public boolean deleteTodoById(Long id)
    {
        return todos.remove(id) != null;
    }
}
