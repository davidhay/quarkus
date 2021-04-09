# quickstart project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/quickstart-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html.

## Related guides

- Quarkus Extension for Spring Web API ([guide](https://quarkus.io/guides/spring-web)): Use Spring Web annotations to create your REST services

## Provided examples

### Spring Web example

Spring, the Quarkus way! A Hello World Spring Web Controller.

[Related guide section...](https://quarkus.io/guides/spring-web#greetingcontroller)

====
```
RESTful APIs:

GET /fruits - Retrieve all Fruits as a JSON array
DELETE /fruits/{id} - Delete by ID
POST /fruits/name/{name}/color/{color} - create a new Fruit with a name and color
PUT /fruits/id/{id}/color/{color} - Update a fruit with a new color
GET /fruits/color/{color} - Retrieve all fruits of the specified color
```


```
GET /taster - taste all fruits and report result
GET /taster/{color} - Taste only fruits of the specified color
```

```
./mvnw package -Dquarkus.package.type=uber-jar -DskipTests
java -jar ./target/quickstart-1.0.0-SNAPSHOT-runner.jar
```
oops
```
$ java -jar ./target/quickstart-1.0.0-SNAPSHOT-runner.jar
Model classes are defined for the default persistence unit <default> but configured datasource <default> not found: the default EntityManagerFactory will not be created. To solve this, configure the default datasource. Refer to https://quarkus.io/guides/datasource for guidance.
```
oops 2
```
$ java -jar ./target/quarkus-app/quarkus-run.jar
Model classes are defined for the default persistence unit <default> but configured datasource <default> not found: the default EntityManagerFactory will not be created. To solve this, configure the default datasource. Refer to https://quarkus.io/guides/datasource for guidance.
```
