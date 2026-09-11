# AssignmentCar

## Description

This project demonstrates the Builder design pattern using a Car as the product.

The project has two different builders:
- SportsCarBuilder
- FamilyCarBuilder

## Project Structure

- `Car.java` - the product being built.
- `CarBuilder.java` - the abstract builder with common building steps.
- `SportsCarBuilder.java` - builder for a sports car.
- `FamilyCarBuilder.java` - builder for a family car.
- `CarDirector.java` - creates predefined car configurations.
- `Main.java` - demonstrates the builders and prints the results.

## How to Build

Sports car:

```java
Car sportsCar = new SportsCarBuilder()
        .brand("BMW")
        .model("M4")
        .color("Red")
        .year(2024)
        .engine("V8")
        .build();