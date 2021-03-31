package inheritance.lab.stackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings extends ArrayList {
    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<String>();
    }

    public void push(String item) {
        this.data.add(0, item);
    }

    public String pop() {
        if (this.data.isEmpty()) {
            throw new IllegalArgumentException("Inheritance.Lab.stackOfStrings.StackOfStrings is empty!");
        } else {
            return this.data.remove(0);
        }
    }

    public String peek(){
        if (data.isEmpty()) {
            throw new IllegalArgumentException("Inheritance.Lab.stackOfStrings.StackOfStrings is empty!");
        } else {
         return this.data.get(0);
        }
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }
}
