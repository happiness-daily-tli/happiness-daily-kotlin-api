package com.happiness.api.v1.content.application.service

import com.happiness.api.common.KoTestDescribeSpec
import com.happiness.api.v1.content.application.port.command.ContentGenerateCommand
import com.happiness.api.v1.content.application.port.out.ContentGeneratePort
import domain.content.ContentWeather
import io.mockk.mockk

class ContentGenerateServiceTest(
    private val contentGeneratePort: ContentGeneratePort = mockk(),
    private val contentGenerateUseCase: ContentGenerateService = ContentGenerateService(
        contentGeneratePort = contentGeneratePort
    )
) : KoTestDescribeSpec() {

    /**
     * Describe	설명할 테스트 대상을 명시한다.
     * Context	테스트 대상이 놓인 상황을 설명한다.
     * It	테스트 대상의 행동을 설명한다.
     **/
    init {
        describe("Content Generate Service") {
            context("올바른 컨텐츠 데이터를 전달 받은 경우") {
                val command = ContentGenerateCommand(
                    title = "행복해요! 행복일기!",
                    content = "오늘은 너무 행복했어요!",
                    weather = ContentWeather.HAPPY,
                    isOpen = false,
                    contentImages = emptyList()
                )

                it("데이터 저장에 성공한다.") {
                    contentGenerateUseCase.generate(command)
                }
            }

        }

    }
}
