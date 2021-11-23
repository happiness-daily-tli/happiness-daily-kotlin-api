rootProject.name = "happiness-daily-api"

include(
    "happiness-app-api",
    "happiness-common",
    "modules:logging",
    "modules:monitoring"
)

project(":happiness-app-api").projectDir = File("happiness-app-api")
project(":happiness-common").projectDir = File("happiness-common")

pluginManagement {
    val kotlinVersion: String by settings
}
