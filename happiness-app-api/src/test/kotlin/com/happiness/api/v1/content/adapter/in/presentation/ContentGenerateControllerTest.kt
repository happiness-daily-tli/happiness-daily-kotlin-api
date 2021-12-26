package com.happiness.api.v1.content.adapter.`in`.presentation

import com.happiness.api.v1.content.application.dto.ContentGenerateRequestDto
import domain.content.ContentImages
import domain.content.ContentWeather
import io.kotest.core.spec.DisplayName
import io.kotest.core.spec.style.DescribeSpec
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.servlet.MockMvc

@ActiveProfiles("test")
@DisplayName("ContentGenerateController 클래스")
@WebMvcTest(ContentGenerateController::class)
class ContentGenerateControllerTest : DescribeSpec({
    lateinit var mockMvc: MockMvc
    val uri = "v1/content"

//    Describe	설명할 테스트 대상을 명시한다.
//    Context	테스트 대상이 놓인 상황을 설명한다.
//    It	테스트 대상의 행동을 설명한다.
    describe("Content Generate") {
        context("올바른 컨텐츠 데이터를 전달 받은 경우") {
//            every {}

            val content = ContentGenerateRequestDto(
                title = "제목 테스트",
                content = "내용입니다.",
                contentImages = ContentImages(1, "dsa"),
                weather = ContentWeather.CLOUDY
            )

//            val json = jacksonObjectMapper().writeValueAsString(content)

            it("컨텐츠 정보를 등록한다.") {
//                mockMvc.perform(
//                    post(uri)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .body(content.toArray())
//                ).andDo(MockMvcResultHandlers.print())
            }
        }

        context("올바른 컨텐츠 데이터를 전달 받지 못한 경우") {

            val content = ContentGenerateRequestDto(
                title = "제목 테스트",
                content = "내용입니다.",
                contentImages = ContentImages(1, "dsa"),
                weather = ContentWeather.CLOUDY
            )

            it("컨텐츠 정보 등록에 실패한다.") {

            }
        }
    }
})
