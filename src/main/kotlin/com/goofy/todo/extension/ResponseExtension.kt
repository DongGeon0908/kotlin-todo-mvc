package com.goofy.todo.extension

import com.goofy.todo.dto.PageResponseWrapper
import com.goofy.todo.dto.ResponseWrapper
import org.springframework.data.domain.Page
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

/**
 * Wrap Response Page
 **/
fun <T> Page<T>.wrapPage() = PageResponseWrapper(this)

/**
 * Wrap Response Ok
 **/
fun <T> T.wrapOk() = ResponseEntity.ok(ResponseWrapper(this))

/**
 * Wrap Response Created
 **/
fun <T> T.wrapCreated() = ResponseEntity.status(HttpStatus.CREATED).body(ResponseWrapper(this))

/**
 * Wrap Response Void
 **/
fun Unit.wrapVoid() = ResponseEntity.noContent()
