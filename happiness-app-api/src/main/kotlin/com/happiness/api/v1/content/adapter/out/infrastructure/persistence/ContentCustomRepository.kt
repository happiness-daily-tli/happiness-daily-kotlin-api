package com.happiness.api.v1.content.adapter.out.infrastructure.persistence

import domain.content.Content

interface ContentCustomRepository {
    fun findByContentCode(contentCode: String): Content
}
