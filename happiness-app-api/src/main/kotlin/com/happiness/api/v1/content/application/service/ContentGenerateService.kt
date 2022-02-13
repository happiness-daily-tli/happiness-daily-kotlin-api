package com.happiness.api.v1.content.application.service

import annotation.UseCase
import com.happiness.api.v1.content.application.port.`in`.ContentGenerateUseCase
import com.happiness.api.v1.content.application.port.command.ContentGenerateCommand
import com.happiness.api.v1.content.application.port.out.ContentGeneratePort
import domain.content.Content
import org.springframework.transaction.annotation.Transactional

@UseCase
@Transactional
class ContentGenerateService(
    private val contentGeneratePort: ContentGeneratePort
) : ContentGenerateUseCase {

    override fun generate(command: ContentGenerateCommand) {
        // 저장 UseCase 실행
        contentGeneratePort.save(
            Content(
                title = command.title,
                content = command.content,
                weather = command.weather,
                isOpen = command.isOpen,
                contentImages = command.contentImages
            )
        )
    }
}
