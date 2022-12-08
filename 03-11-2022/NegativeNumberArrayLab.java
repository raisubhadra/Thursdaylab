//write a program to print all negative numbers in an array.
package arrayExamples;
import java.util.Scanner;

public class NegativeNumberArrayLab 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int size,i;         //initializing variables
		System.out.println("Please enter array size: ");
		size = sc.nextInt();
		int[] Neg_arr = new int[size]; //Initializing Array
		System.out.println("Enter "+size+" element in an array:");
		for(i=0;i<size;i++)
		{
		Neg_arr[i] = sc.nextInt();  //Adding elements in Array
		}
		//Loop through the array for negative value

		System.out.println("List of negative elements in an array : ");

		for(i= 0;i<size;i++)
		{
		if(Neg_arr[i]<0)
		{
		System.out.print(Neg_arr[i]+" ");
		}
		}
		}

		}
