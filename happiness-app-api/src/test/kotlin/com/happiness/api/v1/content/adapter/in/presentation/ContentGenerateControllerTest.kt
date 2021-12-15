package com.happiness.api.v1.content.adapter.`in`.presentation

import com.happiness.api.v1.content.application.dto.ContentGenerateRequestDto
import domain.content.ContentImages
import domain.content.ContentWeather
import io.kotest.core.annotation.DisplayName
import io.kotest.core.spec.style.DescribeSpec
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc

@AutoConfigureMockMvc
@DisplayName("ContentGenerateController 클래스")
@WebMvcTest(ContentGenerateController::class)
class ContentGenerateControllerTest : DescribeSpec({

    var mockMvc: MockMvc
    val uri = "/v1/forget/member-id/email"

    val a = ContentGenerateRequestDto(
        title = "",
        content = "fdsa",
        contentImages = ContentImages(1, "dsa"),
        weather = ContentWeather.CLOUDY
    )


//    ContentGenerateRequestDto()

//    Create

//    ContentGenerateRequestDto().apply {
//        isContent = true
//    }

//    ContentGenerateController.generate(
//        ContentGenerateRequestDto().apply {
//            isContent = true
//        }
//    )

    val url = ""
//    mockMvc.perform()

    describe("") {
        context("") {
            it("") {
            }
        }
    }
})
