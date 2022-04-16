package day24_CustomMethod_Return;

public class ReturnStatement {

    public static void main(String[] args) {

        nameOfDay(10);
    }

    public static void nameOfDay(int number){


        // 4. Create a method that can print the name of the day based on the
        //given number to the method

        if (number < 1 || number >7){
            System.out.println("ınvalid");
            return; // exits nameOfday method
        }

        if (number== 1){
            System.out.println("mon");
        }else if (number==2){
            System.out.println("tues");
        }else if (number==3) {
            System.out.println("wens");
        }else if (number==4) {
            System.out.println("thurs");
        }else if (number==5) {
            System.out.println("friday");
        }else if (number==6) {
            System.out.println("sat");
        }else{
            System.out.println("sunday");
        }

    }
}
