//write a program to find out first and last digit from a number and addition.
package corejavaproject;

import java.util.Scanner;

public class FindFirstAndLastNumber 
{

	public static void main(String[] args)
	{
		int n, first_D, last_D, sum = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		temp = n;
		// to find last digit
		last_D = n%10;
		// to find first digit
		while(n>=10)
		{
		   n = n/10;
		}
		first_D = n;
		//Print first and last digit
		System.out.println("The first digit in number is "+first_D+" and the last digit is "+last_D);
		// Calculating the sum of first and last digit
		sum = first_D+last_D;
		System.out.println("The sum of the first and last digit of "+temp+" is "+sum);
	}
	
}
