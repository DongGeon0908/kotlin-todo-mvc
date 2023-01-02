package com.goofy.todo.service

import com.goofy.todo.repository.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoService(
    private val todoRepository: TodoRepository
) {
    
}
