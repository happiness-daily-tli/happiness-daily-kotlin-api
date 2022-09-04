package enums

enum class ContentWeather(
    private val weather: String
) {
    RAIN("비"),
    CLOUDY("흐림"),
    SUNNY("맑음"),
    HAPPY("행복"),
}
