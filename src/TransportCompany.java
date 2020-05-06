public class TransportCompany {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("Mercedes-Benz Sprinter ", 100,
                10, true);
        cars[1] = new Car("Volvo FH16 750", 500,
                18, true);
        cars[2] = new Car("Volvo FH ", 300,
                15, true);

        System.out.println("Z włączoną klimatyzacją w samochodzie:");
        for (Car car : cars) {
            car.setCarAirConditioning(true);
            System.out.println(car.getName() + " pokona odległość " +
                    car.lengthInSpace() + " km");
        }

        System.out.println("\nZ wyłączoną klimatyzacją w samochodzie:");
        for (Car car : cars) {
            car.setCarAirConditioning(false);
            System.out.println(car.getName() + " pokona odległość " +
                    car.lengthInSpace() + " km");
        }
    }
}