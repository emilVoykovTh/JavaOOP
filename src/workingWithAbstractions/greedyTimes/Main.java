
package workingWithAbstractions.greedyTimes;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");
        if(bagCapacity >= 0) {
            Bag bag = new Bag(bagCapacity);

            for (int i = 0; i < safe.length; i += 2) {
                String currentItem = safe[i];
                long count = Long.parseLong(safe[i + 1]);
                if (count < 0 || currentItem.length() < 3){
                    continue;
                }
                if (currentItem.length() == 3) {
                    bag.collectCash(currentItem, count);
                } else if (currentItem.toLowerCase().endsWith("gem") && currentItem.length() >= 4) {
                    bag.collectGems(currentItem, count);
                } else if (currentItem.toLowerCase().equals("gold")) {
                    bag.collectGold(count);
                }
            }

            bag.printInventory();
        }
    }
}