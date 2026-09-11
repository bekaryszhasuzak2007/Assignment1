public abstract class CarBuilder {

    protected String brand;
    protected String model;
    protected String color;
    protected int year;
    protected String engine;

    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder year(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public Car build() {
        if (brand == null || brand.isEmpty()) {
            throw new IllegalStateException("Brand is required");
        }

        return new Car(brand, model, color, year, engine);
    }
}