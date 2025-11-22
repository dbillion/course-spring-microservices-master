package dev.dayozoe.samples.eventdriven.consumera

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import dev.dayozoe.samples.eventdriven.consumera.message.CallmeEvent
import java.util.function.Consumer

@SpringBootApplication
class ConsumerAApplication {

    val logger: Logger = LoggerFactory.getLogger(ConsumerAApplication::class.java)

    @Bean
    fun callmeEventConsumer(): Consumer<CallmeEvent> = Consumer { logger.info("Received: {}", it) }
}

fun main(args: Array<String>) {
    runApplication<ConsumerAApplication>(*args)
}