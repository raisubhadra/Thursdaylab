package corejavaproject;

import java.util.Scanner;

public class AllPerfectNo1To50 
 {

	public static void main(String[] args) 
	{
		int n,sum=0,i;		
		   Scanner sc=new Scanner(System.in);
		   System.out.println(" Enter number to check perfect Number 1 to 50 ");
			
		   for(n=1;n<=50;n++)//check and taake 1 to 50 
			{
				for(i=1;i<=n/2;i++)
				{
				if(n%i==0) 
				{
					sum=sum+i; 
				}
			}
			if(n==sum)
			{
				System.out.println(sum);
			
			}
			sum=0;

			}
	}
 }


