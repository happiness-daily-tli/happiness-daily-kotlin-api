package com.happiness.api.v1.content.application.port.command

import com.happiness.api.v1.content.application.dto.ContentImage
import enums.ContentWeather

data class ContentGeneratePortCommand(
    val title: String,
    val content: String,
    val weather: ContentWeather,
    val isOpen: Boolean = false,
    val contentImages: List<ContentImage>,
) {

    data class Result(
        val id: Long,
        val contentId: String,
    )
}
