package Oop1Lab2;

import java.util.Scanner;

public class StarPrintTest {

	public static void main(String[] args) {
		int side, i, j;
		Scanner s1 = new Scanner(System.in);
		
		System.out.print(" Please Enter any Side of a Triangle : ");
		side = s1.nextInt();	
			
		for(i = 1; i <= 3; i++)
		{
			for(j = 1; j <=i; j++)
			{
				System.out.print("*"); 
			}
			System.out.print("\n"); 

	}
	

}
}
