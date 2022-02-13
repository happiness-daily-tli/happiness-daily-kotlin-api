package com.happiness.api.v1.content.adapter.out.infrastructure.persistence.impl

import com.happiness.api.v1.content.adapter.out.infrastructure.persistence.ContentCustomRepository
import domain.content.Content

class ContentRepository : ContentCustomRepository {


    override fun findByContentCode(contentCode: String): Content {
        TODO("Not yet implemented")
    }
}
