package inheritance.lab.randomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {
    public T getRandomElement(){
        Random random = new Random();
        int index = random.nextInt(super.size());
        return super.remove(index);
    }
}
