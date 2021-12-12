package com.happiness.api.v1.content.application.dto

import domain.content.ContentImages
import domain.content.ContentWeather

data class ContentGenerateRequestDto(
    var title: String,
    var content: String,
    var weather: ContentWeather,
    var isOpen: Boolean = false,
    var contentImages: ContentImages,
)
