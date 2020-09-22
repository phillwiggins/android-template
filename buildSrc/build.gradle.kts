import Build_gradle.PluginsVersions.JACOCO

repositories {
    jcenter()
}

plugins {
    `kotlin-dsl`
}

object PluginsVersions {
    const val JACOCO = "0.8.5"
}

dependencies {
    implementation("org.jacoco:org.jacoco.core:${JACOCO}")
}