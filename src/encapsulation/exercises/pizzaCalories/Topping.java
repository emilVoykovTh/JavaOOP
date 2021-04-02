package encapsulation.exercises.pizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    public void setToppingType(String toppingType) {
        if (!"Meat".equals(toppingType) && !"Veggies".equals(toppingType) && !"Cheese".equals(toppingType) && !"Sauce".equals(toppingType)) {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        } else {
            this.toppingType = toppingType;
        }
    }

    public void setWeight(double weight) {
        if (weight >= 1 && weight <= 50){
            this.weight = weight;
        }else {
            throw new IllegalArgumentException(this.toppingType + " weight should be in the range [1..50].");
        }
    }

    private double getToppingModifier(){
        double calModifier = 0;
        if (this.toppingType.equals("Meat")){
            calModifier = 1.2;
        }else if (this.toppingType.equals("Veggies")){
            calModifier = 0.8;
        }else if (this.toppingType.equals("Cheese")){
            calModifier = 1.1;
        }else if (this.toppingType.equals("Sauce")){
            calModifier = 0.9;
        }
        return calModifier;
    }

    public double calculateCalories(){
        return (this.weight * 2) * getToppingModifier();
    }

}
