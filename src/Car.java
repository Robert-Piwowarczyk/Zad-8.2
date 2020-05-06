public class Car extends Vehicle {
    private static double CAR_AIR_CONDITIONING_CONSUMPTION = 0.8;
    private boolean carAirConditioning;

    public Car(String name, double tankCapacity, double fuelConsumption,
               boolean carAirConditioning) {
        super(name, tankCapacity, fuelConsumption);
        this.carAirConditioning = carAirConditioning;
    }
    public void setCarAirConditioning(boolean carAirConditioning){
        this.carAirConditioning = carAirConditioning;
    }
    public boolean thisCarAirConditioning(){
        return carAirConditioning;
    }
    @Override
    public double allFuelConsumption(){
        if(carAirConditioning) {
            return getFuelConsumption() + CAR_AIR_CONDITIONING_CONSUMPTION;
        }else{
            return getFuelConsumption();
        }
    }
}
