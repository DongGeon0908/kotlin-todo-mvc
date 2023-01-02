package com.goofy.todo.exception

open class BusinessException(
    val errorCode: ErrorCode,
    override val message: String? = errorCode.description
) : RuntimeException(message ?: errorCode.description)
