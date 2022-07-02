plugins {
    id("java")
}

group = "com.xhyan.zero"
version = "1.0-SNAPSHOT"

repositories {
    maven(uri("https://maven.aliyun.com/repository/public/"))
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter:2.7.1")
    implementation("org.springframework.boot:spring-boot-starter-web:2.7.1")
    implementation("org.springframework.boot:spring-boot-starter-actuator:2.7.1")
    //测试依赖库
    testImplementation(platform("org.junit:junit-bom:5.8.2"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}