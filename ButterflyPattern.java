package com.codegnan.patterns;

public class ButterflyPattern {

	public static void main(String[] args) {
		int rows=5;
		//upper part of the butterfly pattern(expanding wings)
		for(int i=1;i<=rows;i++) {//outer for loop for rows(controls the current row number)
			//inner for loop 1: print the star as left wing
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//inner for loop 2: print spaces in middle gap
			//the no. of spaces decrease as i increase
			//formula=2*(rows-i);
			int spaces=2*(rows-i);
			for(int k=1;k<=spaces;k++) {
				System.out.print(" ");
			}
			//inner for loop 3: print stars as right wing
			for(int a=1;a<=i;a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//lower part of butterfly pattern
		for(int i=rows-1;i>=1;i--) {//outer for loop below butterfly pattern
			for(int j=1;j<=i;j++) {
				//inner for loop 1 (downward pattern)
				//print the stars on left wing
				//the number of stars decrease with i
				System.out.print("*");
			}
			//inner loop 2 print spaces
			int spaces=2*(rows-i);
			for(int k=1;k<=spaces;k++) {
				System.out.print(" ");
			}
			
			//inner for loop 3: print stars
			for(int a=1;a<=i;a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
