package com.happiness.api.config
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcBuilderCustomizer
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.web.filter.CharacterEncodingFilter

@TestConfiguration
class MockMvcTestConfig {

    @Bean
    fun <T : Nothing?> mockMvcBuilderCustomizer(): MockMvcBuilderCustomizer {
        return MockMvcBuilderCustomizer {
            it.addFilters<T>(CharacterEncodingFilter("UTF-8", true))
        }
    }
}
