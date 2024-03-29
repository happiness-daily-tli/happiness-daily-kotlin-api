import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val projectGroup: String by project
val applicationVersion: String by project
val kotlinVersion: String by project

plugins {
    id("org.springframework.boot") version "2.7.3"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("com.gorylenko.gradle-git-properties") version "2.3.1"

    kotlin("jvm") version "1.5.21"
    kotlin("plugin.spring") version "1.5.21"
    kotlin("plugin.jpa") version "1.5.21"
}

allprojects {
    repositories {
        mavenCentral()
    }
}

object Version {
    const val kotest = "4.4.3"
}

subprojects {
    apply(plugin = "kotlin")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")
    apply(plugin = "org.jetbrains.kotlin.plugin.jpa")
    apply(plugin = "com.gorylenko.gradle-git-properties")

    java.sourceCompatibility = JavaVersion.VERSION_11

    dependencies {
        implementation("org.springframework.boot:spring-boot-starter-web")
        implementation("org.springframework.boot:spring-boot-starter-data-jpa")
        implementation("org.springframework.boot:spring-boot-starter-validation")
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

        developmentOnly("com.h2database:h2:1.4.200")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
        testImplementation("io.kotest:kotest-runner-junit5:${Version.kotest}")
        testImplementation("io.kotest:kotest-assertions-core:${Version.kotest}")
        testImplementation("io.kotest:kotest-extensions-spring:${Version.kotest}")
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
