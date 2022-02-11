package com.happiness.api.v1.content.application.port.out

import domain.content.Content

interface FindContentPort {
    fun find(contentCode: String): Content
}
