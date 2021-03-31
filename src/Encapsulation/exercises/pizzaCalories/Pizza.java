package Encapsulation.exercises.pizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setDough(dough);
        this.setToppings(numberOfToppings);
    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.length() > 15 ||name == null){
            throw new IllegalArgumentException("Encapsulation.Exercises.pizzaCalories.Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }else {
            this.toppings = new ArrayList<>(numberOfToppings);
        }
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    public double getOverallCalories(){
        double totalCalories = 0;
        for (Topping topping : toppings) {
            totalCalories += topping.calculateCalories();
        }
        totalCalories += this.dough.calculateCalories();
        return totalCalories;
    }
}
