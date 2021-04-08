package polymorphism.exercises.problem1and2Vehicles;

public class Bus extends Vehicle implements IVehicle{
    public Bus(double fuelQuantity, double fuelConsumptionLitPerKM, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionLitPerKM, tankCapacity);
    }

    @Override
    public String drive(double distance) {
        this.setFuelConsumptionLitPerKM(this.getFuelConsumptionLitPerKM() + 1.4);
        return String.format("%s %s", this.getClass().getSimpleName()
                , super.drive(distance));
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters);
    }

    public String driveEmpty(double distance){
        return String.format("%s %s", this.getClass().getSimpleName()
                , super.drive(distance));
    }
}
