package com.uma.array;

import java.util.Scanner;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by uma.parvathi on 5/26/18.
 */
public class MissingAndRepeatedNumber {


		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			int array[] = new int[size];
			int newArray[] = new int[size];

			for(int i=0;i<size;i++)
				array[i] = sc.nextInt();

			for(int j = 0; j < size; j++) {
				int val = Math.abs(array[j]) - 1;
				if(array[val] > 0) {
					array[val] = -array[val];
				}
				else
					array[val] += (-size);
				//newArray[val]=newArray[val]+1;
			}

			for(int i = 0; i < size; i++) {
				if(Math.abs(array[i]) > size) {
					System.out.println(i+1);
				}
			}

			System.out.println("-------------");
			for(int i = 0; i < size; i++) {
				if(array[i] > 0) {
					System.out.println(i+1);
				}
			}

		}

}
