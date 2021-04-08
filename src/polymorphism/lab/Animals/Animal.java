package polymorphism.lab.Animals;

public abstract class Animal {
    private String name;
    private String favoriteFood;

    protected Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    protected String getName() {
        return name;
    }

    protected String getFavoriteFood() {
        return favoriteFood;
    }

    public abstract String explainSelf();

}
