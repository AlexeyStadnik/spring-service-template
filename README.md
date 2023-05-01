# Service template API

## Introduction


The technology stack is as follows:
- **Spring boot** as the application framework
- **PostgreSQL** as the database
- **Flyway** for database migrations
- **Gradle** as the build tool
- **Docker** for containerization
- **OpenAPI** for the API documentation and **OpenAPI Generator** for generating the server based on the OpenAPI spec
- **Testcontainers** for integration testing
- **Checkstyle** and **PMD** for static code analysis

## Commands
- `./gradlew openApiGenerate` - generates controllers and models based on the OpenAPI spec
- `./gradlew build` - builds the project
- `./gradlew bootRun` - runs the project

To run locally you will need to have a PostgreSQL database running. Just run `docker-compose up` to start the database.
Environment variables to run locally:
```bash
export SPRING_PROFILES_ACTIVE=local
```

## API Documentation

The API documentation can be found at