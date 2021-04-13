package examPreparations.javaAdvancedExamPrep.vetClinic;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private int capacity;
    private List<Pet> data;
    public Clinic(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public void add(Pet pet){
        if (data.size() < capacity){
            data.add(pet);
        }
    }

    public boolean remove(String name){
        for (Pet pet : data) {
            if (pet.getName().equals(name)){
                data.remove(pet);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner){
        for (Pet pet : data) {
            if (pet.getOwner().equals(owner) && pet.getName().equals(name)){
                return pet;
            }
        }
        return null;
    }

    public Pet getOldestPet(){
        int oldest = Integer.MIN_VALUE;
        Pet oldestPet = null;
        for (Pet pet : data) {
            if (pet.getAge() > oldest){
                oldestPet = pet;
                oldest = pet.getAge();
            }
        }
        return oldestPet;
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("The clinic has the following patients:").append(System.lineSeparator());
        for (Pet pet : data) {
            sb.append(String.format("%s %s", pet.getName(), pet.getOwner())).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }



}
