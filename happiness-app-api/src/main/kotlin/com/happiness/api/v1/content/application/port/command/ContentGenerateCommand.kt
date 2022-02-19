package com.happiness.api.v1.content.application.port.command

import com.happiness.api.v1.content.application.dto.ContentImage
import domain.content.ContentWeather

data class ContentGenerateCommand(
    var title: String,
    var content: String,
    var weather: ContentWeather,
    var isOpen: Boolean = false,
    var contentImages: List<ContentImage>,
)
