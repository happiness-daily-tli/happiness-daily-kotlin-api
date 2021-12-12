package com.happiness.api.v1.content.adapter.`in`.presentation

import com.happiness.api.v1.content.application.dto.ContentGenerateRequestDto
import com.happiness.api.v1.content.application.port.`in`.ContentGenerateUseCase
import com.happiness.api.v1.content.application.port.command.ContentGenerateCommand
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RequestMapping("/api/v1/content")
@RestController
class ContentGenerateController(
    //private val contentGenerateUseCase: ContentGenerateUseCase
) {

    @PostMapping
    fun generate(
        @RequestBody @Valid contentGenerateRequestDto: ContentGenerateRequestDto
    ): String {
//        contentGenerateUseCase.generate(
//            ContentGenerateCommand().apply {
//
//            }
//        )

        return "1"
    }
}
