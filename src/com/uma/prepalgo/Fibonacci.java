package com.uma.prepalgo;

import java.util.Scanner;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by uma.parvathi on 5/31/18.
 */
public class Fibonacci {

	//1 1 2 3 5 8 13....
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int firstNumber=1, secondNumber=1,thirdNumber=0;

		if(size==1)
			System.out.println(firstNumber);

		else if(size==2) {
			System.out.println(firstNumber);
			System.out.println(secondNumber);
		}
		else
		{
			for(int i=1;i<size;i++) {
				System.out.println(firstNumber);
				thirdNumber=firstNumber+secondNumber;
				firstNumber=secondNumber;
				secondNumber=thirdNumber;

			}
		}
	}
}
