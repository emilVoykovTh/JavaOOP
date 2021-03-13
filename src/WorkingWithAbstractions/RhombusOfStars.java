package WorkingWithAbstractions;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(printTriangle(n, true));

        for (int r = 1; r <= n - 1; r++) {
            System.out.print(printStars(r, " "));
            System.out.print(printStars(n - r, "* "));
            System.out.println();
        }
    }

    public static String printTriangle(int n, boolean isUpperOrientated) {
        StringBuilder string = new StringBuilder();
        for (int r = 1; r <= n; r++) {
            int spaces = isUpperOrientated ? n - r : r;
            int stars = isUpperOrientated ? r : n - r;

            string.append(printStars(spaces, " "));
            string.append(printStars(stars, "* "));
            if (r != n) {
                string.append(System.lineSeparator());
            }
        }
        return string.toString();
    }


    public static String printStars(int n, String toRepeat) {
        StringBuilder string = new StringBuilder();
        for (int s = 0; s < n; s++) {
            string.append(toRepeat);
        }
        return string.toString();
    }


}
