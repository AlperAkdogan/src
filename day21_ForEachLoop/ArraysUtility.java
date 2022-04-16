package day21_ForEachLoop;


import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] numbers = {10,9,0,1,2,20};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers); // sort the array in ascending order

        System.out.println(Arrays.toString(numbers));

        System.out.println("min score = " + numbers[0]);
        System.out.println("max score = "+ numbers[numbers.length-1]);

        String [] names = {"Gunay", "Alper", "sevilay", "Aydan"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("------------------------------------------------------------");

        int[] arr1 ={1,3,2};
        int []arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 =Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("-----------------------------------------------------------------");

        char[] ch1= {'a', 'c', 'b'};
        char[] ch2= {'b', 'a', 'c'};

        Arrays.sort(ch1); // a b c
        Arrays.sort(ch2); // a b c

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println(anagram);


    }
}
