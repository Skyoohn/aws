buildscript{
    ext{
        springBootVersion = '2.1.7.RELEASE'
    }
    repositories{
        mavenCentral()
    }
    dependencies{
        classpath("org.springframework.boot:spring-boot-" +
                "gradle-plugin:${springBootVersion}")
    }
}
plugins {
    id('java')
    id('eclipse')
    id('org.springframework.boot')
    id('io.spring.dependency-management')
}
repositories{
    mavenCentral()
}
dependencies{
    compile('org.springframework.boot:spring-boot-starter-web')
    testCompile('org.springframework.boot:spring-boot-starter-test')
}


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}