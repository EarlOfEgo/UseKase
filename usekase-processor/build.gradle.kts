plugins {
    kotlin("jvm") version "1.2.31"
    kotlin("kapt") version "1.2.31"
    id("com.novoda.bintray-release") version "0.8.1"
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jre7:1.2.31")
    implementation("com.squareup:kotlinpoet:0.7.0")
    implementation("com.google.auto.service:auto-service:1.0-rc4")
    kapt("com.google.auto.service:auto-service:1.0-rc4")
    compileOnly(project(":usekase"))
}

publish {
    userOrg = "stefma"
    groupId = "guru.stefma.cleancomponents"
    artifactId = "usekase-processor"
    uploadName = "UseKase-Processor"
    publishVersion = "0.0.1"
    desc = "Provides a annotation process for the default UseCase implementations for the Clean Architecture"
    website = "https://github.com/StefMa/UseKase"
}