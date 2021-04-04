package interfacesandAbstraction.exercises.multipleImplementation;

public class Robot implements Machine {

    private String id;
    private String model;

    public Robot(String id, String model) {
        this.setId(id);
        this.setModel(model);
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setModel(String model) {
        this.model = model;
    }

    //override interfacesandAbstraction.exercises.problemFoodShortage.Identifiable
    public String getId() {
        return this.id;
    }

    @Override
    public String getModel() {
        return this.model;
    }

}
