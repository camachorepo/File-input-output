import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentHandler {
	
	
	public static void main(String[] args) {
		
		//Problem # 5 
		ArrayList <Student> students = new ArrayList<Student>();
		String studentsPath = "C:\\Users\\Students\\Desktop\\students.csv";
		
		File file = new File (studentsPath);
		
		
				Scanner studentScanner;
				try {
					studentScanner = new Scanner (file);
					while (studentScanner.hasNextLine()) {
						String [] text = studentScanner.nextLine().split(",");
						
						Student newStudent = new Student();
						
						newStudent.setName(text[0]);
						newStudent.setGrade(Integer.parseInt(text[1]));
						newStudent.setGpa(Double.parseDouble(text[2]));
						
						students.add(newStudent);
						
					}
					
					for(Student s : students){
						
						System.out.println(s.getInfo());
					}
					

					
				} catch (FileNotFoundException e) {
					System.out.println(" Could not file student.csv ");
				}
				

		
		
	
		

			
			
			
	
		
		//  Week 5 Assignment 4 Question #4
/*		String namePath = "C:\\Users\\Students\\Desktop\\names.txt";
		String gpaPath = "C:\\Users\\Students\\Desktop\\gpas.txt";
		String gradePath = "C:\\Users\\Students\\Desktop\\grades.txt";
		
		int [] grades = new int [10];
		double [] gpas = new double [10];
		String [] names = new String[10];
		
		
		
		File fileName  = new File (namePath);
		File fileGpa = new File (gpaPath);
		File fileGrade = new File (gradePath);
		
		
		
		try {
			int i=0;
			Scanner inputNames = new Scanner(fileName);
			while(inputNames.hasNextLine()) {
				
				names [i] = inputNames.nextLine();
				i+=1;
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file names.txt ");
		}
		
		try {
			Scanner inputGrades = new Scanner (fileGrade);
			int j=0; 
			while(inputGrades.hasNextLine()) {
				
				grades[j] = Integer.parseInt(inputGrades.nextLine());
				j+=1;
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file grades.txt");
		}
		
		try {
			Scanner inputGpas =  new Scanner (fileGpa);
			int l=0; 
			while(inputGpas.hasNextLine()) {
				
				gpas[l]= Double.parseDouble(inputGpas.nextLine());
				l+=1;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file gpas.txt");
		}
		
	Student[] newStudents = new Student[10];
	
	for(int studentIndex=0; studentIndex<newStudents.length; studentIndex++) {
		
		newStudents[studentIndex] = new Student();
		newStudents[studentIndex].setName(names[studentIndex]);
		newStudents[studentIndex].setGrade(grades[studentIndex]);
		newStudents[studentIndex].setGpa(gpas[studentIndex]);
		
		
	}
	
	for(Student s : newStudents) {
		
		System.out.println(s.getInfo());
		
	}*/
	
		// Week 5 Assignment 4 Question #3
/*		Student newStudent = new Student();
 * 		Scanner input = new Scanner(System.in);
 * System.out.println("Hello i save user information in local files for later access");
		System.out.println("Please enter student name : ");
		newStudent.setName(input.nextLine());
		System.out.println("Please enter grade : ");
		newStudent.setGrade(input.nextInt());
		System.out.println("Please enter gpa : ")
		
		FileWriter nameWriter; 
		FileWriter gpaWriter; 
		FileWriter gradeWriter;
		
		
		try {
			nameWriter = new FileWriter(fileName, true);
			nameWriter.write(newStudent.getName() + "\r\n");
			nameWriter.close();
		} catch (IOException e) {

			
			System.out.println("Cannot write name to file ");
		}
		
		try {
			gradeWriter = new FileWriter(fileGrade, true);
			gradeWriter.write(newStudent.getGrade() + "\r\n");
			gradeWriter.close();
		} catch (IOException e) {

			
			System.out.println("Cannot write grade to file ");
		}
		
		try {
			gpaWriter = new FileWriter(fileGpa, true);
			gpaWriter.write(newStudent.getGpa() + "\r\n");
			gpaWriter.close();
		} catch (IOException e) {

			
			System.out.println("Cannot write GPA to file ");
		}*/
		
		
	}

}
