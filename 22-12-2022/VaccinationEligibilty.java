/*Write a code to implement covid vaccination booster doze system. 
For male if the age is more than 60 and for female if the age is more than fifty and nationality must be 
Indian then eligible for doze. Else throw custom exception with proper message.*/
package arrayExamples;

import java.util.Scanner;
class Vaccine
{
	String nationality;
	String gender;
	int age;
	public Vaccine(String nationality, String gender, int age) 
	{
		super();
		this.nationality = nationality;
		this.gender = gender;
		this.age = age;
	}
	public String getNationality() 
	{
		return nationality;
	}
	public String getGender() 
	{
		return gender;
	}
	public int getAge() 
	{
		return age;
	}
	
}
public class VaccinationEligibilty 
{
	//Method to check eligibility
	//Checking for Male candidates
    public static void eligibility(String gender,int age,String nationality) throws VaccinationException   
   {
        if (gender.equalsIgnoreCase("male")&& age >= 60 && nationality.equalsIgnoreCase("Indian"))
		{
			System.out.println("Welcome Sir! You are eligible for Booster Dose.");
        }    
    	//Checking for Female candidates
        else if (gender.equalsIgnoreCase("female")&& age >= 50 && nationality.equalsIgnoreCase("Indian"))
		{
			System.out.println("Welcome ma'am! You are eligible for Booster Dose.");
		}
		else
		    //Handling Exception 
			throw new VaccinationException("Error!Please check for possible errors and try again:"
						+ "\n 1. Nationality should be Indian"
						+ "\n 2. Age should be 60 years and above for Men & 50 years and above for Women");
   }
public static void main (String []args)   
{
	String nationality;
	String gender;
	int  age;
	
	Scanner sc = new Scanner(System.in);
	
	//Taking input from user
	System.out.print("Please enter your nationality: ");
	nationality = sc.nextLine();
	
	System.out.print("Please enter your gender: ");
	gender = sc.nextLine();
    
	System.out.print("Please enter your age: ");
	age = sc.nextInt();
	sc.nextLine();
	
	//try block to identify possible error
	try
	{
		 VaccinationEligibilty.eligibility(gender,age,nationality);
    }  
	catch(VaccinationException ve)
	{
		System.out.println(ve.getMessage());
		//check2.printStackTrace();
	}
}	
}