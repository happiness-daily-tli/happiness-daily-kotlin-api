package com.happiness.api.v1.application.dto.content

import com.sun.istack.NotNull

data class ContentGenerateRequestDto(

    @field:NotNull
    var isContent: Boolean = false
)
