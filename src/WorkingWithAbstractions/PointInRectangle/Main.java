package WorkingWithAbstractions.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rectInput = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Point bottomLeft = new Point(rectInput[0], rectInput[1]);
        Point topRight = new Point(rectInput[2], rectInput[3]);
        
        Rectangle rectangle = new Rectangle(bottomLeft, topRight);
        
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            int[] pointCoordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            Point point = new Point(pointCoordinates[0], pointCoordinates[1]);
            System.out.println(rectangle.containsPoint(point));
        }

    }
}
