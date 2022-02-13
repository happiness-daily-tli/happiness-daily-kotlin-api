package com.happiness.api.v1.content.application.service

import annotation.UseCase
import com.happiness.api.v1.content.application.port.`in`.ContentQueryUseCase
import com.happiness.api.v1.content.application.port.out.FindContentPort
import org.springframework.transaction.annotation.Transactional

@UseCase
@Transactional(readOnly = true)
class ContentQueryService(
    private val findContentPort: FindContentPort
) : ContentQueryUseCase {

    override fun query(contentCode: String) {
        findContentPort.find(contentCode)
    }

}
