package Inheritance.Lab.RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> nums = new RandomArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }

        System.out.println(nums.getRandomElement());
    }

}
