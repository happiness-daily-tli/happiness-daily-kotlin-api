package com.happiness.api.v1.content.application.service

import annotation.UseCase
import com.happiness.api.v1.content.application.port.`in`.ContentGenerateUseCase
import com.happiness.api.v1.content.application.port.command.ContentGenerateCommand
import com.happiness.api.v1.content.application.port.out.ContentGeneratePort

@UseCase
class ContentGenerateService() : ContentGenerateUseCase {

    override fun generate(command: ContentGenerateCommand): String {
        TODO("Not yet implemented")
    }
}
