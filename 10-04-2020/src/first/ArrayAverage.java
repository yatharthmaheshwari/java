package first;
import java.util.Scanner;
public class ArrayAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int average = 0;
		int sum = 0;
		
		System.out.println("please enter the number of students you have:");
		
		int userStudents = sc.nextInt();
		
		
	
		
		int userStudentMarks[] = new int[userStudents];
		
		System.out.print(userStudentMarks);
		
		for (int i = 0; i < userStudents ; i++) {
			
			System.out.println("Enter the marks: ");
			userStudentMarks[i] = sc.nextInt();
		    sum = sum + userStudentMarks[i];
		}
		
		System.out.println(average);
		
		average = sum/userStudents;
		
		

	}

}
