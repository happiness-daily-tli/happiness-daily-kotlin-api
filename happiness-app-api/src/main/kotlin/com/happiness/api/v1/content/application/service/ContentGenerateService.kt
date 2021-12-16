package com.happiness.api.v1.content.application.service

import annotation.UseCase
import com.happiness.api.v1.content.application.port.`in`.ContentGenerateUseCase
import com.happiness.api.v1.content.application.port.command.ContentGenerateCommand

@UseCase
class ContentGenerateService : ContentGenerateUseCase {
    override fun generate(command: ContentGenerateCommand): String {
        TODO("Not yet implemented")
    }
}
