package com.uma.prepalgo;

/**
 * Created by uma.parvathi on 6/2/18.
 */
public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}

	public static boolean isPalindrome(String input1){
		String input=input1.toLowerCase().replaceAll("[^A-Za-z0-9]","");
		int i=0,j=input.length()-1;
		while(i<j){
			if(input.charAt(i)==' ' && i<(input.length()-1))
				i++;
			if(input.charAt(j)==' '&& j>=1)
				j--;
			if(input.charAt(i)==input.charAt(j)){
				i++;
				j--;
			}
			else
				return false;
		}
		return true;

	}
}
