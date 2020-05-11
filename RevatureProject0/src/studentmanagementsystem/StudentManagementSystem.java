package studentmanagementsystem;

import java.util.Scanner;

public class StudentManagementSystem {

	public static void main(String[] args) {
		
		//Ask how many new users we want to add
		System.out.println("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		StudentInfo[] students = new StudentInfo[numOfStudents];
		
		
		//Create n number of new students
		for(int n = 0; n < numOfStudents; n++) {
			students[n] = new StudentInfo();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].showInfo());
		}
	}
}
