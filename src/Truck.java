public class Truck extends Car {
    private static double WITH_LOAD_CONSUMPTION = 0.5;
    private static double CAR_AIR_CONDITIONING_CONSUMPTION = 1.6;
    private double loading;

    public Truck(String name, double tankCapacity,
                 double fuelConsumption, boolean carAirConditioning,
                 double loading) {
        super(name, tankCapacity, fuelConsumption, carAirConditioning);
        this.loading = loading;
    }
    public void setLoading(double loading){
        this.loading = loading;
    }
    public double getLoading(){
        return loading;
    }
    @Override
    public double allFuelConsumption(){
        double allFuelConsumption = getFuelConsumption();
        if(thisCarAirConditioning()){
            allFuelConsumption += CAR_AIR_CONDITIONING_CONSUMPTION;
        }
        double loadingConsumption = loading/100 * WITH_LOAD_CONSUMPTION;
        allFuelConsumption += loadingConsumption;
        return allFuelConsumption;
    }
}
