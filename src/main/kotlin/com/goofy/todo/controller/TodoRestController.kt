package com.goofy.todo.controller

import com.goofy.todo.extension.wrapOk
import com.goofy.todo.service.TodoService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Api(value = "Todo Api")
@RestController
@RequestMapping("/api/v1/todo", produces = [MediaType.APPLICATION_JSON_VALUE])
class TodoRestController(
    private val todoService: TodoService
) {
    @ApiOperation(value = "생성")
    @PostMapping
    fun insert() = "MOCK API".wrapOk()

    @ApiOperation(value = "단건 조회")
    @GetMapping("/{id}")
    fun find() = "MOCK API".wrapOk()

    @ApiOperation(value = "페이징 조회")
    @GetMapping
    fun findAll() = "MOCK API".wrapOk()

    @ApiOperation(value = "수정")
    @PatchMapping("/{id}")
    fun update() = "MOCK API".wrapOk()


    @ApiOperation(value = "삭제")
    @DeleteMapping("/{id}")
    fun delete() = "MOCK API".wrapOk()
}
