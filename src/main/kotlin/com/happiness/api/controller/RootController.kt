package com.happiness.api.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RestController
class RootController {
//
//    @Value("\${spring.profiles.active}")
//    private val activeProfile: String? = null

    @GetMapping("/ping")
    fun ping(): String {
        val now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))

        println(now.toString())

        return now.toString()
//        return String.format("OK %s [%s]", activeProfile, now)
    }
}
