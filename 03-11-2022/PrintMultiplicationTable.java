//write a program to print multiplication table
package corejavaproject;

import java.util.Scanner;

public class PrintMultiplicationTable
{

	public static void main(String[] args)
	{
		
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		System.out.println("The table of "+n +" is:");
		for(int i=1;i<=10;i++) 
		{
			System.out.println(n*i);
	}

}
}