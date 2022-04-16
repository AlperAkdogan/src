package day11_SwitchStatements;

public class Grade {

    public static void main(String[] args) {

        char ch = 'B';
        String result = "";


        switch (ch){
            case 'A':
                result=("Excellent");
                break;

            case 'B':
                result ="Great job";
                break;

            case 'C':
                result ="good";
                break;

            case 'D':
                result ="passed";
                break;

            case 'F':
                result ="failed";
                break;

            default:
                result ="Invalid";



        }

        System.out.println(result);
    }
}
