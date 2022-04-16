package day10_nested_if;

public class NameOfMonth {

    public static void main(String[] args) {

        int number =5;

        String result =(number==1)? "Jan" :(number==2)? "Feb" :(number==3)? "March" :(number==4)? "April" :(number==5)? "May"
        :(number==6)? "June" :(number==7)? "July" :(number==8)? "Ags" :(number==9)? "sep" :(number==10)? "oct"
        :(number==11)? "nov" : "december";

        System.out.println(result);
    }
}
