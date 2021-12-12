package com.happiness.api.v1.content.adapter.`in`.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/v1/content")
@RestController
class ContentQueryController {

    @GetMapping
    fun query(): ApiResponse<String> {
        return ApiResponse.success()
    }
}
