package interfacesandAbstraction.lab.borderControl;

public class Robot implements Identifiable, Machine {

    private String id;
    private String model;

    public Robot(String model, String id) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getID() {
        return id;
    }
}
