package com.happiness.api.v1.content.application.port.out

import com.happiness.api.v1.content.application.port.command.ContentGeneratePortCommand

interface ContentGeneratePort {
    fun save(content: ContentGeneratePortCommand): ContentGeneratePortCommand.Result
}
