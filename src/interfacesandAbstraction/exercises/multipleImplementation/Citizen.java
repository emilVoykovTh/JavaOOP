package interfacesandAbstraction.exercises.multipleImplementation;

public class Citizen implements Person, Identifiable, Birthable{

    private String name;
    private int age;
    private String birthDate;
    private String id;


    public Citizen(String name, int age, String id, String birthday) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthDate(birthday);
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getId() {
        return id;
    }

    private void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    private void setId(String id) {
        this.id = id;
    }


    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }
}
