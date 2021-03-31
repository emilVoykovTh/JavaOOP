package inheritance.exercises.person;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        if (name.trim().isEmpty() || name == null){
            throw new IllegalArgumentException("Name can't be empty!");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("Age can't be negative!");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
