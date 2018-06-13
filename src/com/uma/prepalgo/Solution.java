package com.uma.prepalgo;

/**
 * Created by uma.parvathi on 6/2/18.
 */
class Solution {
	public int compress(char[] chars) {
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
		return output.length();

	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		char[] i = {'a'};
		int len = sol.compress(i);
	}
}