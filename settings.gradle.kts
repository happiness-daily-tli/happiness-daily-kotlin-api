rootProject.name = "happiness-daily-api"

include(":app-client-api")
include(":common")

project(":app-client-api").projectDir = File("app/client-api")
project(":common").projectDir = File("common")
