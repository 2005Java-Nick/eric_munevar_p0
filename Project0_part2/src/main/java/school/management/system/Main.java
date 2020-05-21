package school.management.system;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Main {
	
	private Logger log = Logger.getRootLogger();
	
	public static void main(String[] args) throws Exception {
		
		DatabaseManager databaseManager = new DatabaseManager();  // Create the database manager.
				
		List<Teacher> teacherList = new ArrayList<Teacher>();

		List<Student> studentList = new ArrayList<Student>();
		
		School queensCollege = new School(teacherList, studentList);
		
		Student.enrollStudent();
		
		Teacher.enrollTeacher();

		
		
		System.out.println("Queens College's Revenue is $" + School.totalExpenses);
		if(School.totalExpenses < 0) {
			//throw new InsufficientSchoolFundsException(String.format("QC IS IN DEBT!!!");
			System.out.println("QC IS IN DEBT!!!");
		}
		
		System.out.println("Queens College's Expenses are $" + Teacher.salaryEarned);
		
	}
	
}
