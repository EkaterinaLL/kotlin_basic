plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "kotlin_basic_ibs"
include("src:main:Module1")
findProject(":src:main:Module1")?.name = "Module1"
