package polymorphism.exercises.problem1and2Vehicles;

public class Car extends Vehicle implements IVehicle {

    public Car(double fuelQuantity, double fuelConsumptionLitPerKM, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionLitPerKM, tankCapacity);
    }


    @Override
    public void setFuelConsumptionLitPerKM(double fuelConsumptionLitPerKM) {
        super.setFuelConsumptionLitPerKM(fuelConsumptionLitPerKM + 0.9);
    }

    @Override
    public String drive(double distance) {

        return String.format("%s %s", this.getClass().getSimpleName()
                , super.drive(distance));
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters);
    }
}
