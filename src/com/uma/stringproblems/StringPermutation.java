package com.uma.stringproblems;

import java.util.Arrays;

/**
 * Created by uma.parvathi on 6/3/18.
 */
public class StringPermutation {
	public static void main(String[] args) {
		String s1="hello";
		String s2="ellho";
		StringPermutation sol = new StringPermutation();
		System.out.println(sol.isPermutation(s1, s2));
	}

	private boolean isPermutation(String s1, String s2){
		if(s1.length()!=s2.length())
			return false;
		String s11 = sort(s1);
		String s22 = sort(s2);
		if(s11.equalsIgnoreCase(s22))
			return true;
		else
			return false;
	}

	private String sort(String s){
		char[] stringArray=s.toCharArray();
		Arrays.sort(stringArray);
		return new String(stringArray);
	}
}
