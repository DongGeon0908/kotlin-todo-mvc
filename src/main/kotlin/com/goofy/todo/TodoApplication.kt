package com.goofy.todo

import com.goofy.todo.extension.Zone
import mu.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationListener
import org.springframework.core.env.Environment
import java.util.*

@SpringBootApplication
class TodoApplication(
    private val environment: Environment
) : ApplicationListener<ApplicationReadyEvent> {
    private val logger = KotlinLogging.logger { }

    override fun onApplicationEvent(event: ApplicationReadyEvent) {
        logger.info { "applicationReady status ${environment.activeProfiles.contentToString()}" }
    }
}

fun main(args: Array<String>) {
    init()
    runApplication<TodoApplication>(*args)
}

fun init() {
    TimeZone.setDefault(TimeZone.getTimeZone(Zone.KST))
    System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "100")
}
