package polymorphism.lab.Animals;

public class Dog extends Animal{

    public Dog(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String explainSelf() {
        return "I am " + this.getName() + " and my favourite food is " + this.getFavoriteFood() + System.lineSeparator() + "DJAAF";
    }
}
