plugins {
	kotlin("jvm")
    `maven-publish`
    id("org.jetbrains.dokka") version "1.5.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

tasks.dokkaJavadoc {
    dokkaSourceSets {
        named("main") {
            sourceRoots.from(file("src/main/java"))
        }
    }
}

val javadocJar by tasks.creating(Jar::class) {
    dependsOn(tasks.dokkaJavadoc)
    archiveClassifier.set("javadoc")
    from(tasks.dokkaJavadoc.get().outputDirectory)
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("kotlin") {
                from(components["kotlin"])

                groupId = "org.example.library"
                artifactId = "library"
                version = "1.0"

                artifact(javadocJar)
            }
        }
    }
}
