package com.happiness.api.common

import com.happiness.api.config.MockMvcTestConfig
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.extensions.spring.SpringExtension
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.context.annotation.Import
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.MockMvc

@AutoConfigureMockMvc
@Import(
    MockMvcTestConfig::class
)
@WebAppConfiguration
abstract class KoTestDescribeSpec(body: DescribeSpec.() -> Unit = {}) : DescribeSpec(body) {

    override fun extensions() = listOf(SpringExtension)

    @Autowired
    lateinit var mockMvc: MockMvc
}
