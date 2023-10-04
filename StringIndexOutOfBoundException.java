package Task11;

public class StringIndexOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  S = "orange";
		
		try
		{
		 String substring = S.substring(2, 8);
		}
		
		catch(StringIndexOutOfBoundsException ex)
	
		{
			System.out.println("String Index out of bound");
		}
		
		

	}

}
