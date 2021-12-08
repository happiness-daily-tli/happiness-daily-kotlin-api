package com.happiness.api.v1.interfaces.content

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ContentGenerateController {

    @PostMapping("v1/content")
    fun generate(): String {

        return "1"
    }
}
