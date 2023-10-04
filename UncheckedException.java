package Task11;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=0;
		int c;
	
   try 
   {		
     c=a/b;
     System.out.println("The value of c is  "+c);
     
    }
   
   catch(ArithmeticException ex)
	{
		System.out.println("We cant divide by Zero");
		
	}
}
	
}
