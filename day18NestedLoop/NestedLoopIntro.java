package day18NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            System.out.println("WoodenSpoon");// 5 times
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("WoodenSpoon"); // 5 before 5 now 10 times
        }

        // whenever there is a repeating...

        System.out.println("----------------------------------------------------------------");

        for (int j = 0; j < 4; j++) { // 0 1 2 3     1 kez execute oldu   2 kez

            for (int i = 0; i <5 ; i++) {// 0 1 2 3 4   5 kez oldu          10
                System.out.println("Wooden Spoon");

            }
        }
    }
}
