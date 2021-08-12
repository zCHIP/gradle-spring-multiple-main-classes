# Gradle: Spring boot multiple main classes

This example project shows how to get **multiple** executable shadowed jars with the same class files but **different main class entries** in the manifest.

This can be useful for the projects where microservices sharing major of the same code base, but doing different jobs.

## Build

```bash
./gradlew clean build shadowJar
```

## Run

```bash
java -jar build/libs/app1.jar
```
