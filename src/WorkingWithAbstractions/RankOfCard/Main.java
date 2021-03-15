package WorkingWithAbstractions.RankOfCard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String inputRank = scanner.nextLine();
        String inputSuit = scanner.nextLine();

        CardRank rank = CardRank.valueOf(inputRank);
        CardSuit suit = CardSuit.valueOf(inputSuit);

        Card card = new Card(rank, suit);

        System.out.println(card.toString());
    }
}
