package com.happiness.api.v1.content.adapter.`in`.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ContentQueryController {

    @GetMapping("/v1/content")
    fun query(): String {
        return "1"
    }
}
