package Task11;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
	try
	{
		int a[]= {6};
		
		System.out.println("The array value of  "+a[5]);
	}
	
	catch(ArrayIndexOutOfBoundsException ex)
	{
        System.out.println("Array index out of bound Exception");
        
	}
	System.out.println("Inside Try block");

}
}
