package encapsulation.exercises.animalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public double productPerDay(){
        return this.calculateProductPerDay();
    }

    private double calculateProductPerDay(){
        if (this.age <= 5){
            return  2;
        }else if (this.age <= 11){
            return  1;
        }else {
            return  0.75;
        }
    }

    @Override
    public String toString() {
        return String.format("Encapsulation.Exercises.animalFarm.Chicken %s (age %d) can produce %.2f eggs per day.", this.name, this.age, this.productPerDay());
    }
}
