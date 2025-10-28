package com.codegnan.patterns;

public class SquarePattern {

	public static void main(String[] args) {
		int rows=5;
		char ch='A';
		for(int i=1;i<rows;i++) {//outer for loop for rows(1 to rows)
			for(int j=1;j<=rows-1;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}

}
