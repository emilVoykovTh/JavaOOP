package workingWithAbstractions.trafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputState = scanner.nextLine().split("\\s+");
        int stateChanges = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String s : inputState) {
            TrafficLight light = new TrafficLight(LightSignal.valueOf(s));
            trafficLights.add(light);
        }

        for (int i = 0; i < stateChanges; i++) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.update();
                System.out.print(trafficLight.getSignal().name() + " ");
            }
            System.out.println();
        }
    }
}
