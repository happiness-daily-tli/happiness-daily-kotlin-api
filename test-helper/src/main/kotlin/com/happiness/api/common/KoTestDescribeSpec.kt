package com.happiness.api.common

import io.kotest.core.spec.style.DescribeSpec

abstract class KoTestDescribeSpec(body: DescribeSpec.() -> Unit = {}) {

    init {
        body
    }
}
