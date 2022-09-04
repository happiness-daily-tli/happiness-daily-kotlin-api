package com.happiness.api.v1.content.application.dto

import enums.ContentWeather

data class ContentGenerateRequestDto(
    val title: String,
    val content: String,
    val weather: ContentWeather,
    val isOpen: Boolean = false,
    val contentImages: List<ContentImage>,
)
