plugins {
    id("java")
}

subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    tasks.getByName<Test>("test") {
        useJUnitPlatform()
    }

}