package com.happiness.api.v1.content.adapter.out.infrastructure.persistence

import com.happiness.api.v1.content.application.port.command.ContentGeneratePortCommand
import com.happiness.api.v1.content.application.port.out.ContentGeneratePort
import com.happiness.api.v1.content.application.port.out.FindContentPort
import domain.content.Content
import org.springframework.stereotype.Component

@Component
class ContentGenerateAdapter(
    private val contentRepository: ContentRepository,
) : ContentGeneratePort, FindContentPort {

    override fun find(contentCode: String): Content {
        return contentRepository.findByContentCode(contentCode)
    }

    override fun save(content: ContentGeneratePortCommand): ContentGeneratePortCommand.Result {
        val content = contentRepository.save(
            Content(
                title = content.title,
                content = content.content,
                weather = content.weather,
                isOpen = content.isOpen,
            )
        )

        return ContentGeneratePortCommand.Result(
            id = content.id,
            contentId = ""
        )
    }
}
