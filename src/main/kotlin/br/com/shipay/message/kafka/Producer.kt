package br.com.shipay.message.kafka

import org.springframework.context.annotation.Primary
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
@Primary
class Producer(private val kafkaTemplate: KafkaTemplate<Int, String>) {

    fun send(topic: String, key: Int, message: String) {
        kafkaTemplate.send(topic, key, message)
    }
}