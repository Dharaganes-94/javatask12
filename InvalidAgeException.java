package Task11;

import java.util.Scanner;

public class InvalidAgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int age;
	    System.out.println("Enter your age");
	    age=sc.nextInt();
		try
		{
			if(age<18)
			{
				throw new Exception("Invalid age");
			}
			
			
		else
		    System.out.println("Valid age");
		}	
		
		catch (Exception ex)
		{
		    System.out.println("--Age must be greater than 18 "+age);

		{
			ex.printStackTrace();
		}
		}
			
		

	}

}
