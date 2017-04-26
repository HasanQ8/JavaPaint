import java.util.Scanner;

public class GradesAverage {

	
	
	public static void main(String [] args){
		
		
		Scanner in = new Scanner(System.in);
		
		int sum=0;
		System.out.print("Enter the number of students: ");
		
		int numStudent = in.nextInt();
		
		for(int i=1; i<= numStudent;i++){
			
			System.out.print("Enter the grade for student " + i + ":");
			
			int grade = in.nextInt();
			
			if(grade >100 || grade < 0){
				
				
				System.out.println("Invalid grade, try again...");
				System.out.print("Enter the grade for student " + i + ":");
				grade = in.nextInt();
			}
			
			sum += grade;
			
		}
		
		double average = sum/numStudent;
		System.out.println("The average is: " + average);
		
	}
}
