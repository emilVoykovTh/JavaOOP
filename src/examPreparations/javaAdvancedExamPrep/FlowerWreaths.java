package examPreparations.javaAdvancedExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();

        ArrayDeque<Integer> lilies = new ArrayDeque<>();
        for (String s : firstLine.split(", ")) {
            int i = Integer.parseInt(s);
            lilies.push(i);
        }

        ArrayDeque<Integer> roses = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int wreaths = 0;
        int storage = 0;

        while (!lilies.isEmpty() && !roses.isEmpty()) {
            int liliesCount = lilies.pop();
            int rosesCount = roses.peek();
            if (liliesCount >= 0 && rosesCount >= 0 && liliesCount <= 120 && rosesCount <= 120) {
                int sum = liliesCount + rosesCount;

                if (sum < 15) {
                    storage += sum;
                    roses.poll();
                }else if (sum == 15) {
                    wreaths++;
                    roses.poll();
                }else if (sum > 15) {
                    liliesCount -= 2;
                    lilies.push(liliesCount);
                }
            }
        }

        if (storage >= 15) {
            int additionalWreaths = storage / 15;
            wreaths += additionalWreaths;
        }

        if (wreaths >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!", wreaths);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", 5 - wreaths);
        }


    }
}
