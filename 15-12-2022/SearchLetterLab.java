//write a program to check if the letter 'e' is present in the word 'mumbai' or not.
package oopsconcept;
import java.util.Scanner;
public class SearchLetterLab 
{
	public static void main(String[] args) {
		String a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input here:"); //Mumbai
		a = sc.nextLine();

		// Checking for 'e' in the string 
		
		if (a.contains("e"))
			System.out.println("The string contains the given letter");
		else
			System.out.println("No such letter can be found in the string");

	}

}