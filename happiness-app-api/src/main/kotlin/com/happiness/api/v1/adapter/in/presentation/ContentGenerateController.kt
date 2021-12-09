package com.happiness.api.v1.adapter.`in`.presentation

import com.happiness.api.v1.application.dto.content.ContentGenerateRequestDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class ContentGenerateController {

    @PostMapping("v1/content")
    fun generate(
        @RequestBody @Valid contentGenerateRequestDto: ContentGenerateRequestDto
    ): String {
        return "1"
    }
}
