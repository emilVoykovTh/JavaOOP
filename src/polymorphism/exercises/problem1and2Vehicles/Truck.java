package polymorphism.exercises.problem1and2Vehicles;

public class Truck extends Vehicle implements IVehicle {

    public Truck(double fuelQuantity, double fuelConsumptionLitPerKM, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionLitPerKM, tankCapacity);
    }

    @Override
    public void setFuelConsumptionLitPerKM(double fuelConsumptionLitPerKM) {
        super.setFuelConsumptionLitPerKM(fuelConsumptionLitPerKM + 1.6);
    }

    @Override
    public String drive(double distance) {
        return String.format("%s %s", this.getClass().getSimpleName()
                , super.drive(distance));
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * 0.95);
    }


}
