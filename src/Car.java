public class Car {
    String brand;
    String model;
    String color;
    int year;

    Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
        this.year = builder.year;
    }

    static class Builder {
        String brand;
        String model;
        String color;
        int year;

        Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder model(String model) {
            this.model = model;
            return this;
        }

        Builder color(String color) {
            this.color = color;
            return this;
        }

        Builder year(int year) {
            this.year = year;
            return this;
        }

        Car build() {
            if (brand == null) {
                throw new RuntimeException("Brand is required");
            }
            return new Car(this);
        }
    }
}