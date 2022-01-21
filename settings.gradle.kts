rootProject.name = "happiness-daily-api"

include(
    "happiness-app-api",
    "happiness-common",
    "test-helper",
//    "modules:logging",
//    "modules:monitoring"
)

pluginManagement {
    val kotlinVersion: String by settings
}
