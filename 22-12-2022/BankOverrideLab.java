//Write program to show method overriding using a Bank class as super class and create some sub class accordingly. 
//Write at least common property (method) and change the implementation in subclass. 
//Display the implementation of each subclass with object.
package arrayExamples;
class Bank //This is the parent class
{
	int getRateOfIntrest()
	{
		return(0);
	}
}
//This is the child class inheriting and overriding parent class method with implementation
class HDFC extends Bank 
{
	int getRateOfInterest()
	{
		return(12);
	}
}
//This is the child class inheriting and overriding parent class method with implementation
class PNB extends Bank 
{
	int getRateOfInterest()
	{
		return(10);
	}
}
//This is the child class inheriting and overriding parent class method with implementation
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return(17);
	}
}

public class BankOverrideLab 
{
	public static void main (String []args)
	{
		//Creating object of each class in order to display the output
		HDFC obj1 = new HDFC();
		PNB obj2 = new PNB();
		SBI obj3 = new SBI();
		
		System.out.println("Rate of Interest for HDFC is:"+obj1.getRateOfInterest());
		System.out.println("Rate of Interest for PMC is: "+obj2.getRateOfInterest());
		System.out.println("Rate of Interest for SBI is: "+obj3.getRateOfInterest());
	} 
	}
