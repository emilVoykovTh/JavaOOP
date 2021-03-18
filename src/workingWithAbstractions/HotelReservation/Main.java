package workingWithAbstractions.HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] commands = scanner.nextLine().split("\\s+");

        PriceCalculator priceCalculator = new PriceCalculator(Double.parseDouble(commands[0])
        , Integer.parseInt(commands[1]), commands[3].equals("SecondVisit") ? DiscountType.SECOND_VISIT :
                DiscountType.valueOf(commands[3].toUpperCase()), Season.valueOf(commands[2].toUpperCase()));

        System.out.printf("%.2f%n", priceCalculator.calculate());
    }
}
