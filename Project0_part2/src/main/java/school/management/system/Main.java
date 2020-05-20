package school.management.system;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Main {
	
	private Logger log = Logger.getRootLogger();
	
	public static void main(String[] args) {
		
		DatabaseManager databaseManager = new DatabaseManager();  // Create the database manager.
		
				
						//public Teacher(id, salary, name)
//		Teacher johnson = new Teacher(1, 500, "Johnson");
//		Teacher henderson = new Teacher(2, 700, "Henderson");
//		Teacher espinoza = new Teacher(3, 600, "Espinoza");
		
		List<Teacher> teacherList = new ArrayList<Teacher>();
//		teacherList.add(johnson);
//		teacherList.add(henderson);
//		teacherList.add(espinoza);
		
						//public Student(id, name, gradeYear)
//		Student williams = new Student(1, "Williams", 4);
//		Student munevar = new Student(2, "Munevar", 3);
//		Student daisy = new Student(3, "Daisy", 1);
		
		List<Student> studentList = new ArrayList<Student>();
//		studentList.add(williams);
//		studentList.add(munevar);
//		studentList.add(daisy);
		
		School queensCollege = new School(teacherList, studentList);
		
		Student.enrollStudent();
		
		Teacher.enrollTeacher();
		
		System.out.println("Queens College's Revenue is $" + School.totalFundsSpent);
		if(School.totalFundsSpent < 0) {
			//throw new InsufficientSchoolFundsException(String.format("QC IS IN DEBT!!!");
			System.out.println("QC IS IN DEBT!!!");
		}

		//School.updateTotalFundsEarned(salary);
		
		System.out.println("Queens College's Expenses are $" + Teacher.salaryEarned);
//		System.out.println("Queens College has earned $" + queensCollege.getTotalFundsEarned());
		
		
		//System.out.println("----------Making School Pay Salary----------");
		//johnson.receiveSalary(johnson.getSalary());
		//System.out.println("Queens College has paid salary to " + johnson.getName() + " and now has $" + queensCollege.getTotalFundsEarned() + " remaining");

	}
	
}
