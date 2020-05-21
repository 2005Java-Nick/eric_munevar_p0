package school.management.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher {
	
	private static int id;
	private static int salary;
	private static String name;
	public static int salaryEarned;
	//public static List<Teacher> teacherList;
	
	
	public Teacher() {
//		this.id = id;
//		this.salary = salary;
//		this.name = name;
//		this.salaryEarned = 0;
	}

	
	
	public static void enrollTeacher() {
		
		//List<Teacher> teacherList = new ArrayList<Teacher>();
		
		System.out.print("To add a teacher enter: 1" + "\n" + "To quit enter: 0\n");
		Scanner act = new Scanner(System.in);
		int action = act.nextInt();
		if(action < 0 && action > 1) {
			return;
		}else if(action == 1) {
			Teacher newTeacher = new Teacher();
			Scanner tName = new Scanner(System.in);
			
			System.out.print("Enter teacher's name: ");
			Teacher.name = tName.nextLine();
			
				System.out.print("Enter amount of salary the school has to pay teacher (0 to quit): ");
				Scanner sOwed = new Scanner(System.in);
				int salaryOwed = sOwed.nextInt();
	//			System.out.print("Salary owed to teacher = $" + salaryOwed + "\n");
				if(salaryOwed != 0) {
					
					receiveSalary(salaryOwed);
					System.out.println(name + " has earned = $" + salaryEarned);
					School.updateTotalExpenses(salaryOwed);
					System.out.println("---------------------------------------------------------");
					//teacherList.add(newTeacher);
				}			
					
			} 
	}
	

//-----------------v-GETTERS-v-----------------------
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


//-----------------v-SETTERS-v-----------------------

	/**
	 * @param salary the salary to set
	 * Salary can be altered
	 */
	public static void setSalary(int salary) {
		Teacher.salary = salary;
	}	
	
	
	/**
	 * adds to salary earned
	 * @param salary
	 * reduces total funds earned by the school
	 */
	public static void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalExpenses(salary);
		
	}
	
	
	
}
