package com.happiness.api.v1.content.application.service

import annotation.UseCase
import com.happiness.api.v1.content.application.port.`in`.ContentGenerateUseCase
import com.happiness.api.v1.content.application.port.command.ContentGenerateCommand
import com.happiness.api.v1.content.application.port.command.ContentGeneratePortCommand
import com.happiness.api.v1.content.application.port.out.ContentGeneratePort
import com.happiness.api.v1.image.application.service.ImageCheckService
import domain.content.ContentImage

@UseCase
class ContentGenerateService(
    private val imageCheckService: ImageCheckService,
    private val contentGeneratePort: ContentGeneratePort,
) : ContentGenerateUseCase {

    override fun generate(command: ContentGenerateCommand) {
        val contentImages = mutableListOf<ContentImage>()

//        command.contentImages.forEach {
//            contentImages.add(
//                ContentImage(
//                    id = null,
//                    imageUrl = it.imageUrl
//                )
//            )
//        }

//        저장 UseCase 실행
        val result = contentGeneratePort.save(
            ContentGeneratePortCommand(
                title = command.title,
                content = command.content,
                weather = command.weather,
                isOpen = command.isOpen,
                contentImages = command.contentImages
            )
        )
    }
}
