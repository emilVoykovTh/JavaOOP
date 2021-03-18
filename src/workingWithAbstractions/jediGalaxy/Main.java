package workingWithAbstractions.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Galaxy galaxy = new Galaxy(dimensions[0], dimensions[1]);
        galaxy.initializeGalaxy();

        String command = scanner.nextLine();
        long result = 0;

        while (!command.equals("Let the Force be with you")) {
            int[] ivoS = Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int[] evil = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            Position evilsPosition = new Position(evil[0], evil[1]);
            galaxy.setEvil(evilsPosition);
            galaxy.destroyStarsByEvil();


            Position ivosPosition = new Position(ivoS[0], ivoS[1]);
            galaxy.setPlayer(ivosPosition);
            result += galaxy.collectStars();


            command = scanner.nextLine();
        }

        System.out.println(result);



    }
}
