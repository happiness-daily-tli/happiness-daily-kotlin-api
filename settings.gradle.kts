rootProject.name = "happiness-daily-api"

include(":app-api")
project(":app-api").projectDir = File("app/client-api")
