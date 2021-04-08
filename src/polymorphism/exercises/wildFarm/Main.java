package polymorphism.exercises.wildFarm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!"End".equals(input = scanner.nextLine())) {
            String[] animalInfo = input.split("\\s+");

            String animalType = animalInfo[0];
            String animalName = animalInfo[1];
            Double animalweight = Double.parseDouble(animalInfo[2]);
            String livingRegion = animalInfo[3];

            String[] foodTokens = scanner.nextLine().split("\\s+");
            Animal animal = null;
            Food food = null;
            if (foodTokens[0].equals("Vegetable")){
                food = new Vegetable(Integer.parseInt(foodTokens[1]));
            }else{
                food = new Meat(Integer.parseInt(foodTokens[1]));
            }

            switch (animalType) {
                case "Cat":
                    String breed = animalInfo[4];
                    animal = new Cat(animalName, animalType, animalweight, livingRegion, breed);

                    break;
                case "Tiger":
                    animal = new Tiger(animalName, animalType, animalweight, livingRegion);
                    break;
                case "Zebra":
                    animal = new Zebra(animalName, animalType, animalweight, livingRegion);
                    break;
                case "Mouse":
                    animal = new Mouse(animalName, animalType, animalweight, livingRegion);
                    break;
            }
            animal.makeSound();
            try {
                animal.eat(food);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println(animal.toString());
        }
    }
}



