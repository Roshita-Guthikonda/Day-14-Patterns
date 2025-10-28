package com.codegnan.patterns;

import java.util.Scanner;

public class HollowSquarePattern {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the side length of the square: ");
	        int side = scanner.nextInt();

	        for (int i = 0; i < side; i++) { 
	            for (int j = 0; j < side; j++) { 
	               
	                if (i == 0 || i == side - 1 || j == 0 || j == side - 1) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  "); 
	                }
	            }
	            System.out.println(); 
	        }

	        scanner.close();


	}

}
