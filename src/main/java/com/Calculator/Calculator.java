package com.Calculator;

import java.util.*;

public class Calculator {

	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
	public static int mul(int a, int b) {
		return a*b;
	}
	
	public static int div(int a, int b) {
		int result;
		if (b == 0) {
			throw new IllegalArgumentException("Divisor cannot divide by zero");
		} else {
			result = Integer.valueOf(a)/Integer.valueOf(b);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice, a, b, result;
		do {
			System.out.println("Press 1	for addition; 2 for subtraction; 3 for multiplication; 4 for division; 0 to exit");
			choice= sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Enter first number: ");
					a= sc.nextInt();
					System.out.println("Enter second number: ");
					b= sc.nextInt();
					result= add(a,b);
					System.out.println("Result:"+result);
					break;
					
			case 2: System.out.println("Enter first number: ");
					a= sc.nextInt();
					System.out.println("Enter second number: ");
					b= sc.nextInt();
					result= sub(a,b);
					System.out.println("Result:"+result);
					break;
					
			case 3: System.out.println("Enter first number: ");
					a= sc.nextInt();
					System.out.println("Enter second number: ");
					b= sc.nextInt();
					result= mul(a,b);
					System.out.println("Result:"+result);
					break;
					
			case 4: System.out.println("Enter first number: ");
					a= sc.nextInt();
					System.out.println("Enter second number: ");
					b= sc.nextInt();
					result= div(a,b);
					System.out.println("Result:"+result);
					break;
					
			default:if(choice!= 0)
						System.out.println("Please give correct input");
					break;
					
			}
			
		}while(choice!= 0);
		System.out.println("Bye");		
		
		sc.close();
	}

	
	
}