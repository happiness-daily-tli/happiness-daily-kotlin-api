package com.happiness.api.v1.content.application.port.`in`

import com.happiness.api.v1.content.application.port.command.ContentGenerateCommand
import org.springframework.stereotype.Service

// @TODO 에러를 잠시 제거하기 위하여 추가해둔 상태
@Service
interface ContentGenerateUseCase {
    fun generate(command: ContentGenerateCommand): String
}
