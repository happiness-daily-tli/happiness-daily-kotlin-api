package com.happiness.api.v1.content.application.service

import annotation.UseCase
import com.happiness.api.v1.content.application.port.`in`.ContentGenerateUseCase
import com.happiness.api.v1.content.application.port.command.ContentGenerateCommand
import com.happiness.api.v1.content.application.port.out.ContentGeneratePort
import domain.content.Content
import domain.content.ContentImage

@UseCase
class ContentGenerateService(
    private val contentGeneratePort: ContentGeneratePort
) : ContentGenerateUseCase {

    override fun generate(command: ContentGenerateCommand) {
        val contentImages = mutableListOf<ContentImage>()

        command.contentImages.forEach {
            contentImages.add(
                ContentImage(
                    id = null,
                    imageUrl = it.imageUrl
                )
            )
        }

        // 저장 UseCase 실행
        contentGeneratePort.save(
            Content(
                title = command.title,
                content = command.content,
                weather = command.weather,
                isOpen = command.isOpen,
                contentImages = contentImages
            )
        )
    }
}
