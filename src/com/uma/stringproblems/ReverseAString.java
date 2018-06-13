package com.uma.stringproblems;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by uma.parvathi on 6/2/18.
 */
public class ReverseAString {

	public static void main(String[] args) {
		String input="Input";
		String output=reverseString(input);
		System.out.println(output);

		System.out.println(reverseString("Madam"));
		System.out.println(reverseString("old"));
		System.out.println(reverseString(" "));
		System.out.println(reverseString("Special_$tring"));
	}

	public static String reverseString(String input){
		char[] output= input.toCharArray();
		char temp;
		int i=0,j=input.length()-1;

		while(i<j){
			temp=output[i];
			output[i]=output[j];
			output[j]=temp;
			i++;
			j--;
		}
		return new String(output);

	}
}
