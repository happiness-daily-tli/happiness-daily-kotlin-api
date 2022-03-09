package com.happiness.api.v1.content.application.port.command

import com.happiness.api.v1.content.application.dto.ContentImage
import domain.content.ContentWeather

data class ContentGenerateCommand(
    val title: String,
    val content: String,
    val weather: ContentWeather,
    val isOpen: Boolean = false,
    val contentImages: List<ContentImage>,
)
