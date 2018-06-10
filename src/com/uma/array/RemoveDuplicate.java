package com.uma.array;

import org.openqa.selenium.interactions.SourceType;

import java.util.HashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] input={10,10,20,30,30,10};

        //removeDup(input);

        removeDupSortedArray(input);

    }
//Walmart
    public static void removeDup(int[] input){
        HashSet<Integer> noDup= new HashSet<Integer>();

        for(int i =0;i<input.length;i++)
            noDup.add(input[i]);


    }

//Realtor.com
    public static void removeDupSortedArray(int[] input){
        int val= input[1];
        int newIndex=0;
        for(int i=1;i<input.length;i++){
            if(input[i]!=val){
                input[++newIndex]=input[i];
                val=input[i];
            }

        }

        for(int j=newIndex;j<input.length;j++ )
            input[j]=0;

        System.out.println(input.toString());

    }
}
