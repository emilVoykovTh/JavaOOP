package interfacesandAbstraction.lab.borderControl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Identifiable> entities = new HashMap<>();
        String input;

        while (!"End".equals(input = scanner.nextLine())){
            String[] tokens = input.split("\\s+");
            Identifiable entity = null;
            if (tokens.length == 2){
                entity = new Robot(tokens[0], tokens[1]);
            }else if (tokens.length == 3){
                entity = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            }
            entities.put(entity.getID(), entity);
        }
        String lastDigitsOfFakeIds = scanner.nextLine();

        for (String s : entities.keySet()) {
            if (entities.get(s).getID().endsWith(lastDigitsOfFakeIds)){
                System.out.println(entities.get(s).getID());
            }
        }
    }
}
