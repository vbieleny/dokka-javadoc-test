plugins {
	kotlin("jvm")
    application
    idea
}

idea {
    module {
        isDownloadJavadoc = true
    }
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.example.library:library:1.0")
}

application {
    mainClass.set("org.example.app.AppKt")
}
