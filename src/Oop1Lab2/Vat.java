package Oop1Lab2;

import java.util.Scanner;

public class Vat {
	

	static Scanner S = new Scanner(System.in);
	
	public static void main(String[] args) {
		double item;
		double tax;
		double Tax = 0.15;
		
		System.out.println("Item price:");
		item = S.nextDouble();
		tax = item*Tax;
		
		
		System.out.println("Tax:" +tax);
		
	}

}
