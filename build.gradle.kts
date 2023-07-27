plugins {
    id("java")
    id("maven-publish")
}

group = "codes.ducksource"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {

    implementation("org.json:json:20230227")

    runtimeOnly("io.grpc:grpc-netty-shaded:1.56.0")
    implementation("io.grpc:grpc-protobuf:1.56.0")
    implementation("io.grpc:grpc-stub:1.56.0")
    compileOnly("org.apache.tomcat:annotations-api:6.0.53")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}


publishing {
    repositories {
        maven {
            name = "grpc"
            url = uri("https://maven.pkg.github.com/josephjredmond/grpc")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            group = ""
            from(components["java"])
        }
    }
}

tasks.test {
    useJUnitPlatform()
}