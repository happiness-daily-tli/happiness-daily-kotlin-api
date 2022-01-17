tasks.getByName("bootJar") {
    enabled = false
}

tasks.getByName("jar") {
    enabled = true
}

object Version {
    const val kotest = "4.4.3"
}

dependencies {

    implementation("org.springframework.boot:spring-boot-starter-test")

    implementation("io.kotest:kotest-runner-junit5:${Version.kotest}")
    implementation("io.kotest:kotest-assertions-core:${Version.kotest}")
    implementation("io.kotest:kotest-extensions-spring-jvm:${Version.kotest}")
}

springBoot {
    buildInfo()
}
