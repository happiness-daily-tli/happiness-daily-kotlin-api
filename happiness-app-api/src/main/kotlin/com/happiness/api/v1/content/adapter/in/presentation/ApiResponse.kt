package com.happiness.api.v1.content.adapter.`in`.presentation

import domain.ResultCode

data class ApiResponse<T>(
    val code: String,
    val message: String,
    val data: T? = null
) {
    companion object {
        fun <T> empty(): ApiResponse<T> {
            return ApiResponse("", "", null)
        }

        fun <T> success() = ApiResponse<T>(ResultCode.SUCCESS.name, ResultCode.SUCCESS.message, null)

        fun <T> success(data: T) = ApiResponse(ResultCode.SUCCESS.name, ResultCode.SUCCESS.message, data)

        fun <T> failure(code: String, message: String) = ApiResponse<T>(code, message, null)

        fun <T> failure(resultCode: ResultCode) = ApiResponse<T>(resultCode.name, resultCode.message, null)
    }
}