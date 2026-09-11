public class CarDirector {

    public Car buildSportsCar() {
        return new SportsCarBuilder()
                .brand("Mercedes-Benz")
                .model("AMG GT63")
                .color("Black")
                .year(2023)
                .engine("V8")
                .build();
    }

    public Car buildFamilyCar() {
        return new FamilyCarBuilder()
                .brand("Toyota")
                .model("Land Cruiser 300")
                .color("White")
                .year(2025)
                .engine("V8")
                .build();
    }
}