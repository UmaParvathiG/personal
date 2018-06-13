package com.uma.stringproblems;

/**
 * Created by uma.parvathi on 6/2/18.
 */
public class StringCompression {
	public static void main(String[] args) {
		String inputString="a";
		char[] chars= inputString.toCharArray();
		StringBuffer output= new StringBuffer();
		int charCounter=0;

		for(int i=0;i<chars.length;i++){
			charCounter++;

			if(i+1>=chars.length||chars[i]!=chars[i+1]){
				output.append(chars[i]);
				output.append(charCounter);
				charCounter=0;
			}


		}
		System.out.println(output);

	}
}
