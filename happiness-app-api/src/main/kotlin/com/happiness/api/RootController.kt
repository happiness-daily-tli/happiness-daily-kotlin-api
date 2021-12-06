package com.happiness.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RestController
class RootController {
//    @Value("\${spring.profiles.active}")
//    private val activeProfile: String? = null

    @GetMapping("/ping")
    fun ping(): String = LocalDateTime.now()
        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
        .toString()
}
