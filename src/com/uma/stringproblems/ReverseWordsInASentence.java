package com.uma.stringproblems;

public class ReverseWordsInASentence {
    public static void main(String[] args) {
        String input="I am a successful person";
        reverseWordsInSentence(input);
    }

    public static void reverseWordsInSentence(String input){
        String[] str=input.split("\\s");
        StringBuilder result= new StringBuilder();

        for(int i=str.length-1;i>=0;i--){
            if(i!=0)
                result.append(str[i]+" ");
            else
                result.append(str[i]);
        }

        System.out.println(result);

    }
}
