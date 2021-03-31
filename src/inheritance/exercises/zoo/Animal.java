package inheritance.exercises.zoo;

public class Animal {
    private String name;

    public Animal(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        if (name.trim().isEmpty() || name == null){
            throw new IllegalArgumentException("Name can't be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
