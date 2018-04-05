import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsCourses {

	public static void main(String[] args) {
		
		String CourseDescLocation = "C:\\Users\\Students\\Desktop\\courseDescription.txt";
		String courseCodeLocation = "C:\\Users\\Students\\Desktop\\courseCode.txt";
		ArrayList <String > courseCodes = new ArrayList <String>();
		ArrayList <String > courseDescs = new ArrayList <String>();
		File courseCodeFile = new File(courseCodeLocation);
		File courseDescFile = new File (CourseDescLocation);
		
		
		
		
		try {
			Scanner scode = new Scanner (courseCodeFile);
			try {
				Scanner sdesc = new Scanner (courseDescFile);
				while(sdesc.hasNextLine() && scode.hasNextLine()) {
					String codeLine = scode.nextLine();
					String descLine = sdesc.nextLine();
					System.out.println(codeLine + " - " + descLine);
				
				}
				
			}
			catch(FileNotFoundException e){
				System.out.println("cannot find course description file");
			}
			
			
		} catch (FileNotFoundException e) {
				System.out.println("Cannot find course code file");
		}
		

		
		
			
			
		
		
		
		
	}
	
	
	
}
