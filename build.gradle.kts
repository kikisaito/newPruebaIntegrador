plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.javalin:javalin-bundle:6.6.0")
    implementation("org.slf4j:slf4j-simple:2.0.16")
    implementation("com.mysql:mysql-connector-j:9.3.0")
    implementation("com.zaxxer:HikariCP:5.1.0")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.17.2")
    implementation("io.github.cdimascio:dotenv-java:3.0.0")
    testImplementation platform('org.junit:junit-bom:5.10.0')
    testImplementation 'org.junit.jupiter:junit-jupiter'
}

tasks.test {
    useJUnitPlatform()
}