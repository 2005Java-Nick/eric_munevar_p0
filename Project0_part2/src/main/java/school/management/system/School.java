package school.management.system;

import java.util.Scanner;
import java.util.List;

public class School {
	
	private List<Teacher> teachers; 	// Dynamic list of teachers
	private List<Student> students;		// Dynamic list of students
	public static int totalFundsEarned;		// Funds gained from students paying their tuition fees
	public static int totalFundsSpent;		// Funds spent towards teacher salaries
	
	
	/**
	 * @param teachers
	 * @param students
	 */
	public School(List<Teacher> teachers, List<Student> students) {
//		super();
//		this.teachers = teachers;
//		this.students = students;
//		totalFundsEarned = 0;
//		totalFundsSpent = 0;
	}

	
	
//-----------------v-GETTERS-v-----------------------

	/**
	 * @return the List of teachers in the school
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}


	/**
	 * @return the List of students in the school
	 */
	public List<Student> getStudents() {
		return students;
	}


	/**
	 * @return the totalFundsEarned by the school
	 */
	public static int getTotalFundsEarned() {
		return totalFundsEarned;
	}


	/**
	 * @return the totalFundsSpent by school
	 */
	public int getTotalFundsSpent() {
		return totalFundsSpent;
	}

	
//-----------------v-SETTERS-v-----------------------
	
	/**
	 * @param adds teachers to the school
	 *  passes in teacher object, doesn't pass in the list
	 */
	public void addTeacher(Teacher teacher) {		//private List<Teacher> teachers;
		teachers.add(teacher);
	}


	/**
	 * @param adds students to the school
	 *  passes in student object, doesn't pass in the list
	 */
	public void addStudent(Student student) {		//private List<Student> students;
		students.add(student);						
	}


	/**
	 * @param fundsEarned are the funds to be added to existing total
	 *  adds/updates total funds earned by the school
	 *  
	 */
	public static void updateTotalFundsEarned(int fundsEarned) {
		totalFundsEarned = totalFundsEarned + fundsEarned;
	}


	/**
	 * @param fundsSpent are the funds, that were previously earned, to be deducted from total earnings
	 *  adds/updates total funds spent by the school (salaries paid to the teachers) 
	 */
	public static void updateTotalFundsSpent(int fundsSpent) {
		totalFundsSpent = totalFundsEarned - fundsSpent;
		//totalFundsSpent -= fundsSpent;
	}

	
//	public void saveUser(UserData ud) {
//		try {
//			log.info("USERDAOSERIAL:saveUser: save user called");
//			absolutePath = userFile.get
//		} 
//		}
	
	
	
}
