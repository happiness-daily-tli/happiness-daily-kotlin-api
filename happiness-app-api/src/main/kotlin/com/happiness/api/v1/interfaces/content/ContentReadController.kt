package com.happiness.api.v1.interfaces.content

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ContentReadController {

    @GetMapping("v1/content")
    fun read(): String {
        return "1"
    }
}
