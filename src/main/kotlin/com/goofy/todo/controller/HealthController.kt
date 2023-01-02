package com.goofy.todo.controller

import com.goofy.todo.dto.HealthResponse
import com.goofy.todo.extension.wrapOk
import org.springframework.core.env.Environment
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/", "health"], produces = [MediaType.APPLICATION_JSON_VALUE])
class HealthController(
    private val environment: Environment
) {
    @GetMapping
    fun healthCheck() = HealthResponse(profiles = environment.activeProfiles.toList()).wrapOk()
}
