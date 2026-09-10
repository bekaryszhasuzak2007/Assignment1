public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .brand("Toyota")
                .model("Camry 55")
                .color("White")
                .year(2016)
                .build();

        System.out.println(car.brand);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);
    }
}