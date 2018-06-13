package com.uma.prepalgo;

import java.util.Scanner;

/**
 * Created by uma.parvathi on 5/31/18.
 */
public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();

		for(int i=2;i<number;i++){
			if(number%i==0){
				System.out.println("The given number is prime");

			}

		}

	}
}
