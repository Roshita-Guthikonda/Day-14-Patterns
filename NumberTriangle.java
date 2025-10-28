package com.codegnan.patterns;

public class NumberTriangle {

	public static void main(String[] args) {
		int rows=6;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				//inner loop 1: prints leading spaces.
				System.out.print(" ");
			}
	
			//inner loop 2
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
