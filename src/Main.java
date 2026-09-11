public class Main {

    public static void main(String[] args) {

        CarDirector director = new CarDirector();

        Car sportsCar = director.buildSportsCar();
        Car familyCar = director.buildFamilyCar();

        System.out.println("Sports Car:");
        System.out.println(sportsCar.brand);
        System.out.println(sportsCar.model);
        System.out.println(sportsCar.color);
        System.out.println(sportsCar.year);
        System.out.println(sportsCar.engine);

        System.out.println();

        System.out.println("Family Car:");
        System.out.println(familyCar.brand);
        System.out.println(familyCar.model);
        System.out.println(familyCar.color);
        System.out.println(familyCar.year);
        System.out.println(familyCar.engine);
    }
}