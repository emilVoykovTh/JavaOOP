import java.util.*;
import java.util.stream.Collectors;

public class Bombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> bombEffects = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
        List<Integer> secondLine = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        Deque<Integer> bombCasings = new ArrayDeque<>();

        for (Integer integer : secondLine) {
            bombCasings.push(integer);
        }

        while (!bombEffects.isEmpty() && !bombCasings.isEmpty()){
            int bombEffect = bombEffects.poll();
        }
    }
}
