package encapsulation.exercises.pizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        }else {
            throw new IllegalArgumentException("Encapsulation.Exercises.pizzaCalories.Dough weight should be in the range [1..200].");
        }
    }

    private void setFlourType(String flourType) {
        if (!"White".equals(flourType) && !"Wholegrain".equals(flourType)){
            throw new IllegalArgumentException("Invalid type of dough.");
        } else {
          this.flourType = flourType;
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!"Crispy".equals(bakingTechnique) && !"Chewy".equals(bakingTechnique) && !"Homemade".equals(bakingTechnique)){
            throw new IllegalArgumentException("Invalid type of dough.");
        } else {
            this.bakingTechnique = bakingTechnique;
        }
    }

    private double getFlowerTypeModifier() {
        double calPerGram = 0;
        if (this.flourType.equals("White")) {
            calPerGram = 1.5;
        } else if (this.flourType.equals("Wholegrain")) {
            calPerGram = 1.0;
        }
        return calPerGram;
    }

        private double getBakingTechniqueModifier(){
        double calPerGram = 0;
        if (this.bakingTechnique.equals("Crispy")) {
            calPerGram = 0.9;
        }else if (this.bakingTechnique.equals("Chewy")){
            calPerGram = 1.1;
        }else if (this.bakingTechnique.equals("Homemade")){
            calPerGram = 1.0;
        }
        return calPerGram;
    }

    public double calculateCalories(){
        return (this.weight * 2) * getFlowerTypeModifier() * getBakingTechniqueModifier();
    }

}
