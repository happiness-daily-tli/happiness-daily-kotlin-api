tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

dependencies {
    implementation(project(":happiness-common"))

    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.1")

    testImplementation(project(":test-helper"))
    testImplementation("org.springframework.restdocs:spring-restdocs-mockmvc")
}

springBoot {
    buildInfo()
}
