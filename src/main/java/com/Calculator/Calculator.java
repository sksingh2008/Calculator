package com.Calculator;

import java.util.*;

public class Calculator {

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice;
		do {
			System.out.println("Press 1	for addition; 2 for subtraction; 3 for multiplication; 4 for division; 0 to exit");
			choice= sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Enter first number: ");
					int a= sc.nextInt();
					System.out.println("Enter second number: ");
					int b= sc.nextInt();
					int result= add(a,b);
					System.out.println("Result:"+result);
					break;
					
			}
			
		}while(choice!= 0);
		System.out.println("Bye");		
		
		sc.close();
	}

	
	
}