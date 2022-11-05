//write a program to to calculate sum of all even numbers from 1 to n
package corejavaproject;

import java.util.Scanner;

public class SumOfAllEvenNumbers 
{

	public static void main(String[] args)
	
	{
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		n=sc.nextInt();
		for(i=2;i<=n;i=i+2)
			
		{
			if(i%2==0)
			{
				sum=i;
			}
			sum=sum+i; //sum+=i;
		}
		System.out.println("Sum of even  numbers from 1 to "+n+" is : " +sum);
		sc.close();
		
	}

}
