package day10_nested_if;

import java.util.Objects;
import java.util.Scanner;

public class WhichWayIsRight {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Did you win first match?");

        boolean PostMatchWin = scan.nextBoolean();
        System.out.println("Do you want to play again?");

        boolean GonnaPlayAgain = scan.nextBoolean();

        if (GonnaPlayAgain) {
            System.out.println("Ask for room master");

            System.out.println("Did they give you the RM?");
            boolean DidTheyGiveIt = scan.nextBoolean();

            if (DidTheyGiveIt) {
                System.out.println("Change map and go to Alpha");

            }
            if (!DidTheyGiveIt) {
                System.out.println("Leave the room");
            }

        }else{
            System.out.println("Take the win and run");
        }
    }
}






