package interfacesandAbstraction.lab.sayHello;

public class Chinese extends BasePerson{

    private String name;

    public Chinese(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
