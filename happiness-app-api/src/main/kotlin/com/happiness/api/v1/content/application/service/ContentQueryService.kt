package com.happiness.api.v1.content.application.service

import annotation.UseCase
import com.happiness.api.v1.content.application.port.`in`.ContentQueryUseCase
import com.happiness.api.v1.content.application.port.out.FindContentPort

@UseCase
class ContentQueryService(
    private val findContentPort: FindContentPort
) : ContentQueryUseCase {

    override fun query(contentCode: String) {
        val find = findContentPort.find(contentCode)

        
    }

}
