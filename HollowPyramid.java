package com.codegnan.patterns;

import java.util.Scanner;

public class HollowPyramid {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
	    	int rows=s.nextInt(); 

	        for (int i = 1; i <= rows; i++) {
	            
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }

	           
	            if (i == 1 || i == rows) {
	                
	                for (int k = 1; k <= (2 * i) - 1; k++) {
	                    System.out.print("*");
	                }
	            } else {
	               
	                for (int k = 1; k <= (2 * i) - 1; k++) {
	                    if (k == 1 || k == (2 * i) - 1) {
	                        System.out.print("*");
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	            }
	            System.out.println(); 
	        }
	        s.close();
	}
}


