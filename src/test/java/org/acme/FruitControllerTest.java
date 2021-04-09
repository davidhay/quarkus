package org.acme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.acme.quickstart.Fruit;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class FruitControllerTest {

  @Test
  public void shouldPersistASurveyGroup() throws Exception {
    Fruit[] fruitArr = RestAssured.given().accept(ContentType.JSON).request()
        .contentType(ContentType.JSON)
        .when().get("/fruits").then()
        .statusCode(200).extract().as(Fruit[].class);

    List<Fruit> fruits = Arrays.stream(fruitArr).collect(Collectors.toList());
    System.out.printf("fruits[%s]%n", fruits);

    assertEquals(Set.of("cherry", "orange", "banana", "avocado", "strawberry"),
        fruits.stream().map(Fruit::getName).collect(Collectors.toSet()));
  }

}
