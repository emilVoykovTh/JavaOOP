package encapsulation.exercises.pizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split("\\s+");
        String[] secondLine = scanner.nextLine().split("\\s+");

        String pizzaName = firstLine[1];
        int numberOfToppings = Integer.parseInt(firstLine[2]);

        String doughType = secondLine[1];
        String doughTechnique = secondLine[2];
        double doughWeight = Double.parseDouble(secondLine[3]);

        //initialize Encapsulation.Exercises.pizzaCalories.Pizza and Encapsulation.Exercises.pizzaCalories.Dough
        try {
            Pizza pizza = new Pizza(pizzaName, numberOfToppings);
            Dough dough = new Dough(doughType, doughTechnique, doughWeight);
            pizza.setDough(dough);

            String command;

            while (!"END".equals(command = scanner.nextLine())) {
                String[] tokens = command.split("\\s+");
                Topping topping = new Topping(tokens[1], Double.parseDouble(tokens[2]));
                pizza.addTopping(topping);
            }

            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
