package com.uma.stringproblems;

import java.io.*;
import java.util.*;


// Develop a function that takes a string of characters, a character to search
// for, and returns an array of all indices that the letter is found at.

// For example:  fn("Hello World", 'l') should return [2, 3, 10].


/*
 * To execute Java, please define "static void main" on a class
 * named SearchCharPos.
 *
 * If you need more classes, simply define them inline.
 */

class SearchCharPos {
    public static void main(String[] args) {


        String searchString = "Hello World";
        searchCharPosition(searchString, 'l');
    }

    public static HashSet<Integer> searchCharPosition(String input,char c){

        char[] ch=input.toCharArray();
        HashSet<Integer> resultSet = new HashSet<Integer>();
        int j=0;
        for(int i=0;i<ch.length;i++){

            if(ch[i]==c){

                resultSet.add(i);
            }
        }
        return resultSet;
    }

}

