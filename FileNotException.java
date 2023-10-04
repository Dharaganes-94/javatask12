package Task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotException {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\91971\\git\\repository\\java-learning1\\Hellowworld3.txt");
        Scanner sc = new Scanner(file);
		System.out.println("Throws Exception");

	}

}

