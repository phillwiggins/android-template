buildscript {
    repositories {
        maven { url = uri("https://jitpack.io") }
        google()
        jcenter()
    }
    dependencies {
        classpath(com.purewowstudio.staticanalysis.Libs.androidGradlePlugin)
        classpath(com.purewowstudio.staticanalysis.Libs.Kotlin.gradlePlugin)
    }
}
allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri("https://jitpack.io") }
    }
}
tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}