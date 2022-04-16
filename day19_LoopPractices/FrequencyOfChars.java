package day19_LoopPractices;

public class FrequencyOfChars {

    public static void main(String[] args) {
       String str = "aabcccd";

       String result="";

        for (int j = 0; j <str.length() ; j++) {  // each char from string
            char ch = str.charAt(j);
            int count = 0;


            for (int i = 0; i < str.length(); i++) {// frequency of each char
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }
                if (result.contains(ch+"")){
                    continue;
                }
            result += ch;
            result += count;


        }
        System.out.println(result);
    }

        }




/*
find of the frequency of char
str="aabcccd";

a2 1c3d1
 */