import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Output {
	
	
	public static void main(String [] args) {
		
		String location = "C:\\Users\\Students\\Desktop\\hola.txt";
		File text = new File (location);
		Scanner input;
		ArrayList<String> lines = new ArrayList<String>();
		try {
			input = new Scanner(text);
			while (input.hasNextLine())
			{
				
				lines.add(input.nextLine()); 
				
				
			}
			
			
			for(int i=0; i< lines.size(); i++) {
				
				for (int j=lines.get(i).length() -1; j>=0 ; j--) {
					
					System.out.print(lines.get(i).charAt(j));
					
				}
				System.out.println();
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} 
		
		
		

		
	}

}
