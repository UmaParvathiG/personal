package com.uma.stringproblems;

public class ReverseStringInPlace {

    public static void main(String[] args) {
        String input="Welcome";
        reverseStringInPlace(input);
    }

    public static void reverseStringInPlace(String input){
        char[] stringToReverse=input.toCharArray();
        int i =0,j=stringToReverse.length-1;
        char temp;
        while(i<j){
            temp=stringToReverse[j];
            stringToReverse[j]=stringToReverse[i];
            stringToReverse[i]=temp;
            i++;
            j--;
        }

        System.out.println(stringToReverse);

    }
}
