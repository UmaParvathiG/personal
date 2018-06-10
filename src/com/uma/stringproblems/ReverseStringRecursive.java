package com.uma.stringproblems;

public class ReverseStringRecursive {

    public static void main(String[] args) {
        String input="Palindrome";
        reverseString(input);
    }

    public static void reverseString(String input){
        if ((input==null)||(input.length() <= 1))
            System.out.print(input);
        else {
            System.out.print(input.charAt(input.length() - 1));
            reverseString(input.substring(0, input.length() - 1));
        }

    }
}
