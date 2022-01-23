package com.happiness.api.v1.content.adapter.`in`.presentation

import com.happiness.api.config.MockMvcTestConfig
import com.happiness.api.v1.content.application.port.`in`.ContentGenerateUseCase
import com.ninjasquad.springmockk.MockkBean
import io.kotest.core.spec.DisplayName
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.extensions.spring.SpringExtension
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.context.annotation.Import
import org.springframework.http.MediaType
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@ActiveProfiles("test")
@AutoConfigureMockMvc
@Import(
    MockMvcTestConfig::class
)
@WebAppConfiguration
@WebMvcTest(ContentGenerateController::class)
@DisplayName("ContentGenerateController 클래스")
class ContentGenerateControllerTest : DescribeSpec() {

    override fun extensions() = listOf(SpringExtension)

    @Autowired
    lateinit var mockMvc: MockMvc

    @MockkBean
    lateinit var contentGenerateUseCase: ContentGenerateUseCase

    private val uri = "v1/content"

    init {

//    Describe	설명할 테스트 대상을 명시한다.
//    Context	테스트 대상이 놓인 상황을 설명한다.
//    It	테스트 대상의 행동을 설명한다.
        describe("Content Generate") {
            context("올바른 컨텐츠 데이터를 전달 받은 경우") {
                every { contentGenerateUseCase.generate(any()) }

                val requestBody = """
                {
                    "title": "제목 입니다.",
                    "content": "내용 입니다.",
                    "contentImages": {
                        "id": 1
                        "imageUrl": "https://temp.img"
                    },
                    "weather": "CLOUDY"
                }
            """.trimIndent()

                it("컨텐츠 정보를 등록한다.") {
                    mockMvc.perform(
                        post(uri)
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(requestBody)
                    ).andDo(
                        MockMvcResultHandlers.print()
                    ).andExpect(
                        status().isOk
                    )
                }
            }

            context("올바른 날씨 데이터를 전달 받지 못한 경우") {

                val requestBody = """
                {
                    "title": "제목 입니다.",
                    "content": "내용 입니다.",
                    "contentImages": {
                        "id": 1
                        "imageUrl": "https://temp.img"
                    },
                    "weather": "FUN"
                }
            """.trimIndent()

                it("컨텐츠 정보 등록에 실패한다.") {

                }
            }
        }
    }
}
