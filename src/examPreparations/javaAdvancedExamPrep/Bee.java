package examPreparations.javaAdvancedExamPrep;

import java.util.Scanner;

public class Bee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int flowersPollinated = 0;

        char[][] territory = new char[n][n];
        for (int row = 0; row < n; row++) {
            territory[row] = scanner.nextLine().toCharArray();
        }

        int[] beePos = findBee(territory);

        String command = "";
        boolean beeLost = false;
        while (!"End".equals(command = scanner.nextLine()) && !beeLost) {
            beePos = move(nextPos(command, beePos), territory, beePos);

            if (isPositionValid(beePos, territory)) {
                if (territory[beePos[0]][beePos[1]] == 'O') {
                    territory[beePos[0]][beePos[1]] = 'B';
                    beePos = move(nextPos(command, beePos), territory, beePos);
                }

                if (isPositionValid(beePos, territory)){
                    if (territory[beePos[0]][beePos[1]] == 'f'){
                        flowersPollinated++;
                    }
                    territory[beePos[0]][beePos[1]] = 'B';
                }else {
                    beeLost = true;
                    break;
                }
            }else {
                beeLost = true;
                break;
            }
        }

        if (beeLost) {
            System.out.println("The bee got lost!");
        }

        if (flowersPollinated >= 5) {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", flowersPollinated);
        } else {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - flowersPollinated);
        }
        printTerritory(territory);


    }

    private static int[] move(int[] nextPos, char[][] territory, int[] beePos) {
        territory[beePos[0]][beePos[1]] = '.';
        beePos = nextPos;
        return beePos;
    }

    private static void printTerritory(char[][] territory) {
        for (char[] chars : territory) {
            System.out.printf("%s%n", String.valueOf(chars));
        }
    }

    private static int[] findBee(char[][] territory) {
        int[] beePos = new int[2];
        for (int row = 0; row < territory.length; row++) {
            for (int col = 0; col < territory.length; col++) {
                if ('B' == territory[row][col]) {
                    beePos = new int[]{row, col};
                    break;
                }
            }
        }
        return beePos;
    }

    private static int[] nextPos(String command, int[] beePos) {
        int[] newPos = new int[2];
        switch (command) {
            case "up":
                newPos = new int[]{beePos[0] - 1, beePos[1]};
                break;
            case "down":
                newPos = new int[]{beePos[0] + 1, beePos[1]};
                break;
            case "left":
                newPos = new int[]{beePos[0], beePos[1] - 1};
                break;
            case "right":
                newPos = new int[]{beePos[0], beePos[1] + 1};
                break;
            default:
                System.out.println("Invalid Command");
                break;
        }
        return newPos;
    }

    private static boolean isPositionValid(int[] beePos, char[][] territory) {
        int row = beePos[0];
        int col = beePos[1];
        return row < territory.length && row >= 0 &&
                col < territory.length && col >= 0;
    }
}
