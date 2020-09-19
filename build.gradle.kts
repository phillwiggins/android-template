buildscript {
    repositories {
        maven { url = uri("https://jitpack.io") }
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.21")
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