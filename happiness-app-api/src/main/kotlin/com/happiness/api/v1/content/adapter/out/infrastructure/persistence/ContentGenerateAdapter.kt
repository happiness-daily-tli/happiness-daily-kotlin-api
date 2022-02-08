package com.happiness.api.v1.content.adapter.out.infrastructure.persistence

import com.happiness.api.v1.content.application.port.command.ContentGenerateCommand
import com.happiness.api.v1.content.application.port.out.ContentGeneratePort
import com.happiness.api.v1.content.application.port.out.FindContentPort
import domain.content.Content
import org.springframework.stereotype.Component

@Component
class ContentGenerateAdapter(
    private val contentRepository: ContentRepository
) : ContentGeneratePort, FindContentPort {

    override fun save(content: Content) {
        contentRepository.save(content)
    }

    override fun find(): Content {
        TODO("Not yet implemented")
    }
}
