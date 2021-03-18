package workingWithAbstractions.greedyTimes;

import java.util.HashMap;
import java.util.Map;

public class Bag {
    private long capacity;
    private long currentItemInventory;

    private Map<String, Long> gems;
    private Map<String, Long> money;
    private long gold;

    public Bag(long capacity) {
        this.capacity = capacity;
        gems = new HashMap<>();
        money = new HashMap<>();
    }

    public void collectGold(long count) {
        if (isAbleToCollect(count)) {
            this.gold += count;
            this.currentItemInventory += count;
        }
    }

    public void collectGems(String currentItem, long count) {
        if (this.gold >= getTotalGems() + count && isAbleToCollect(count)) {

            if (this.gems.containsKey(currentItem)) {
                this.gems.put(currentItem, this.gems.get(currentItem) + count);
            } else {
                this.gems.put(currentItem, count);
            }
            this.currentItemInventory += count;
        }
    }

    public void collectCash(String currentItem, long count) {
        if (getTotalGems() >= getTotalCash() + count && isAbleToCollect(count)) {

            if (this.money.containsKey(currentItem)) {
                this.money.put(currentItem, this.money.get(currentItem) + count);
            } else {
                this.money.put(currentItem, count);
            }
            this.currentItemInventory += count;
        }
    }

    private long getTotalGems() {
        return this.gems.values().stream().mapToLong(value -> value).sum();
    }

    private long getTotalCash() {
        return this.money.values().stream().mapToLong(value -> value).sum();
    }

    public boolean isAbleToCollect(long count) {
        return currentItemInventory + count <= capacity;
    }

    public void printInventory() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.gold >= 0) {
            stringBuilder.append(String.format("<Gold> $%d", this.gold)).append(System.lineSeparator());
            stringBuilder.append(String.format("##Gold - %d", this.gold)).append(System.lineSeparator());
        }
        if (!this.gems.isEmpty()) {
            stringBuilder.append(String.format("<Gem> $%d", getTotalGems())).append(System.lineSeparator());
            this.gems.entrySet().stream().sorted((e1, e2) -> {
                int res = e2.getKey().compareTo(e1.getKey());
                if (res == 0) {
                    res = e1.getValue().compareTo(e2.getValue());
                }
                return res;
            }).forEach(entry -> stringBuilder.append(String.format("##%s - %d", entry.getKey(), entry.getValue())).append(System.lineSeparator()));

        }
        if (!this.money.isEmpty()) {
            stringBuilder.append(String.format("<Cash> $%d", getTotalCash())).append(System.lineSeparator());
            this.money.entrySet().stream().sorted((e1, e2) -> {
                int res = e2.getKey().compareTo(e1.getKey());
                if (res == 0) {
                    res = e1.getValue().compareTo(e2.getValue());
                }
                return res;
            }).forEach(entry -> stringBuilder.append(String.format("##%s - %d", entry.getKey(), entry.getValue())).append(System.lineSeparator()));
        }
        System.out.println(stringBuilder);

    }

}
