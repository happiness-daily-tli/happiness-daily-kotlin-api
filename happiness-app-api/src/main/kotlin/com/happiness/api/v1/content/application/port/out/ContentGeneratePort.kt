package com.happiness.api.v1.content.application.port.out

import com.happiness.api.v1.content.application.port.command.ContentGenerateCommand

interface ContentGeneratePort {
    fun save(content: ContentGenerateCommand)
}
