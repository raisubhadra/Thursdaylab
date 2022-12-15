package oopsconcept;

public class FirstAndLastOccurenceLab 
{
	 public static void main (String []args)
			{
				String a = "Hello world";
				//To search and display first occurrence
				System.out.println("The First Occurrence of the Character is at index: "+a.indexOf('o'));
				//To Search and display last occurrence
				System.out.println("The Last Occurrence of the Character is at index: "+a.lastIndexOf('o'));
				
		   }
}

