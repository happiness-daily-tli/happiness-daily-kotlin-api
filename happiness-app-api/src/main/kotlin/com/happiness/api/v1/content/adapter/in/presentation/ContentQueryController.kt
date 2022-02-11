package com.happiness.api.v1.content.adapter.`in`.presentation

import com.happiness.api.v1.content.application.port.`in`.ContentQueryUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ContentQueryController(
    private val contentQueryUseCase: ContentQueryUseCase
) {

    @GetMapping("/v1/content/{contentCode}")
    fun query(@PathVariable contentCode: String): String {

        contentQueryUseCase.query(contentCode)
        return "1"
    }
}
