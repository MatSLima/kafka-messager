package br.com.shipay.message.kafka

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class Consumer {
    private val logger = LoggerFactory.getLogger(javaClass)

    @KafkaListener(topics = ["process-message"], groupId = "simple-kotlin-consumer")
    fun processMessage(message: String) {
        logger.info("got message: {}", message)
    }

    @KafkaListener(topics = ["process-message2"], groupId = "simple-kotlin-consumer")
    fun processMessage2(message: String) {
        logger.info("got message: {}", message)
    }
}