package Oop1Lab2;

import java.util.Scanner;

public class Rectangle {
	
		
		public static void main(String[] args) {
		    Scanner s1 = new Scanner(System.in);
			
			int length = 0;
			int width = 0;
			int area = 0;
			int perimeter = 0;
			
			System.out.println("Length:");
			length =s1.nextInt();
			
			System.out.println("Width:");
			width =s1.nextInt();
			
			area=length*width;
			perimeter= 2*(length+width);
			
			System.out.println("Rectangle:" +area);
			System.out.println("Perimeter:" +perimeter);
			
			
			
			
			
			
			
		}

	
	

	}
