package studentmanagementsystem;

import java.util.Scanner;

public class StudentInfo {
		
		private String firstName;
		private String lastName;
		private int gradeYear;
		private String studentID;
		private String courses = null;
		private int tuitionBalance = 0;
		private static int costOfCourse = 900;
		private static int id = 1000;
		
		//Constructor prompts user to enter student's name and year
		
		public StudentInfo() {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Enter student's first name: ");
			this.firstName = in.nextLine();
			
			System.out.print("Enter student's last name: ");
			this.lastName = in.nextLine();
			
			System.out.print("1 - Freshman" + "\n2 - Sophomore" + "\n3 - Junior" + "\n4 - Senior" + "\nEnter student's grade year: ");
			this.gradeYear = in.nextInt();
			
			setStudentID();
		}
		
		//Generate an ID
		private void setStudentID() {
			//Grade year + ID
			id++;
			this.studentID = gradeYear + "" + id;
		}
		
		//Enroll in courses
		public void enroll() {
			//Get inside a loop, user hits 0
			System.out.print("Cost per course = $900\n");
			do {
				System.out.print("Enter course(s) to enroll in (Q to quit): ");
				Scanner in = new Scanner(System.in);
				String course = in.nextLine();
				if(!course.equals("Q")) {
					courses = courses + "\n  " + course;
					tuitionBalance += costOfCourse;
				} else {
					break;
				}
			} while (1 != 0);
			viewBalance();
		}
		
		//View balance
		public void viewBalance() {
			System.out.println("-----------------------");
			System.out.println("Tuition balance is: $" + tuitionBalance);
		}
		
		//Pay tuition
		public void payTuition() {
			System.out.print("Enter student payment: $");
			Scanner in = new Scanner(System.in);
			int payment = in.nextInt();
			tuitionBalance = tuitionBalance - payment;
			System.out.println("Payment of $" + payment + " recieved");
			viewBalance();
		}
		//Show all info
		public String showInfo() {
			return "Name: " + firstName + " " + lastName + 
					"\nGrade Year: " + gradeYear +
					"\nStudent ID: " + studentID +
					"\nCourses Enrolled: " + courses + "\n-----------------------";
		}
}
