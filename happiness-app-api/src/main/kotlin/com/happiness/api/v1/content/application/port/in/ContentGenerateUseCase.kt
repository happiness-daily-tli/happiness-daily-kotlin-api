package com.happiness.api.v1.content.application.port.`in`

import com.happiness.api.v1.content.application.port.command.ContentGenerateCommand

interface ContentGenerateUseCase {
    fun generate(command: ContentGenerateCommand)
}
