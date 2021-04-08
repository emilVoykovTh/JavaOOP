package polymorphism.exercises.problem1and2Vehicles;

import java.text.DecimalFormat;

public class Vehicle implements IVehicle {
    private double fuelQuantity;
    private double fuelConsumptionLitPerKM;
    private double tankCapacity;

    protected Vehicle(double fuelQuantity, double fuelConsumptionLitPerKM, double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumptionLitPerKM(fuelConsumptionLitPerKM);
        this.setTankCapacity(tankCapacity);
    }

    public double getFuelConsumptionLitPerKM() {
        return fuelConsumptionLitPerKM;
    }

    public String drive(double distance){
        double fuelNeeded = distance * this.fuelConsumptionLitPerKM;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = "needs refueling";

        if (fuelNeeded <= this.fuelQuantity){
            result = String.format("travelled %s km", decimalFormat.format(distance));
            this.fuelQuantity -= fuelNeeded;
        }
        return result;
    }

    public void setTankCapacity(double tankCapacity) {
        if (tankCapacity < 0){
            throw new IllegalArgumentException("Invalid Tank capacity");
        }
        this.tankCapacity = tankCapacity;
    }

    public void refuel(double liters){
        if (liters <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (this.tankCapacity - liters < 0){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity += liters;
    }

    private void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity < 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumptionLitPerKM(double fuelConsumptionLitPerKM) {
        this.fuelConsumptionLitPerKM = fuelConsumptionLitPerKM;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
