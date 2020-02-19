package Oop1Lab2;

import java.util.Scanner;

public class LargestNum {
	

	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter 1st number:");
		int num1 = s1.nextInt();
		
		System.out.println("Enter 2nd number:");
		int num2 = s1.nextInt();
		
		System.out.println("Enter 3rd number:");
		int num3 = s1.nextInt();
		
		if(num1 >= num3 && num1 >= num3) {
			
			System.out.println(num1+ "Largest number");
			}
		else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2+ "Largest number");
			
		}
		else if(num3 >= num1 && num3 >= num2){
			System.out.println(num3+ "Largest number");
			
			
		}
			
			
				
			
			
		
	}


}
