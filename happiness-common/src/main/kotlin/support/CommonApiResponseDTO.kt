package support

data class CommonApiResponseDTO<T>(
    val success: Boolean?,
    val message: String?,
    val data: T?
) {
    companion object {
        fun <T> success(result: T): CommonApiResponseDTO<T> {
            return CommonApiResponseDTO(
                success = true,
                message = null,
                data = result
            )
        }

        fun <T> error(e: String?): CommonApiResponseDTO<T> {
            return CommonApiResponseDTO(
                success = false,
                message = e,
                data = null
            )
        }
    }
}
