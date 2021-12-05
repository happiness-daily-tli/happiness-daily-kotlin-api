package domain.post

/**
 * created by Gyunny 2021/12/05
 */
enum class PostWeather(
    private val weather: String
) {
    RAIN("비"),
    CLOUDY("흐림"),
    SUNNY("맑음"),
    HAPPY("행복"),
}