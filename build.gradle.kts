dependencies {
    classpath("net.serenity-bdd.serenity-gradle-plugin:3.4.2")
    classpath("net.serenity-bdd.serenity-single-page-report:3.3.0")

}

plugins {
    id "java"
    id("net.serenity-bdd.serenity-gradle-plugin" version "3.3.0")
}

defaultTasks 'clear' ; 'test' ; 'aggregate'
group  "com.alkomprar"
version  "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



tasks.test {
    useJUnitPlatform()
}