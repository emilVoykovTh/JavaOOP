package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        String input;

        while (!"Beast!".equals(input = scanner.nextLine())) {
            String animalType = input;

            String[] animalData = scanner.nextLine().split("\\s+");

            String animalName = animalData[0];
            int age = Integer.parseInt(animalData[1]);
            String animalGender = animalData[2];

            Animal animal = null;
            try {
                switch (animalType) {
                    case "Cat":
                        animal = new Cat(animalName, age, animalGender);
                        break;
                    case "Dog":
                        animal = new Dog(animalName, age, animalGender);
                        break;
                    case "Frog":
                        animal = new Frog(animalName, age, animalGender);
                        break;
                    case "animals.Kitten":
                        animal = new Kitten(animalName, age);
                }
                animals.add(animal);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        animals.stream().forEach(animal -> System.out.println(animal.toString()));

    }
}
