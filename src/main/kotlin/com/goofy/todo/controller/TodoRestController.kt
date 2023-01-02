package com.goofy.todo.controller

import com.goofy.todo.service.TodoService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/todo")
class TodoRestController(
    private val todoService: TodoService
) {
}
