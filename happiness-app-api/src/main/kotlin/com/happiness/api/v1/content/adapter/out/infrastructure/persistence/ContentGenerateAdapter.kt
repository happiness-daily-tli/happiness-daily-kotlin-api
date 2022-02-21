package com.happiness.api.v1.content.adapter.out.infrastructure.persistence

import com.happiness.api.v1.content.application.port.command.ContentGenerateCommand
import com.happiness.api.v1.content.application.port.out.ContentGeneratePort
import com.happiness.api.v1.content.application.port.out.FindContentPort
import domain.content.Content
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
@Transactional
class ContentGenerateAdapter(
    private val contentRepository: ContentRepository
) : ContentGeneratePort, FindContentPort {

    override fun save(content: Content) {
        contentRepository.save(content)
    }

    @Transactional(readOnly = true)
    override fun find(contentCode: String): Content {
        TODO("Content Return")
//        return contentRepository.findByContentCode(contentCode)
    }
}
