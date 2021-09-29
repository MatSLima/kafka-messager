package br.com.shipay.message.controllers

import br.com.shipay.message.kafka.Producer
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource(private val messageProducer: Producer) {
    @PostMapping("/send")
    fun publish(@RequestBody message: String) {
        messageProducer.send("process-message2", 1, message)
    }
}