package school.management.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	
	private static int id;
	private static String name;
	private static int feesPaid = 0;
	private static int tuition = 50000;
	//public static List<Student> studentList;
	
	
	// This constructor creates student object
	// id is definitely unique per student and wont be altered, 
	// name could potentially repeat per student but isn't going to be altered, 
	public Student() {
//		Student.id = id;
//		Student.name = name;
//		Student.feesPaid = 0;
//		Student.tuition = 50000; 
//		--------------------------
		
//		enrollStudent();
		
	}


	public static void enrollStudent() {
		//List<Student> studentList = new ArrayList<Student>();
		
		//Get inside a loop, user hits 0
//		int size;
//		System.out.println("Please enter size of student list: ");
//	    Scanner sl = new Scanner(System.in);
//	    size = sl.nextInt();
//	    makeArray(studentList, size);
	    //sl.close();
	    
		System.out.print("Hello!" + "\n" + "To add a student enter: 1" + "\n" + "To quit enter: 0\n");
		Scanner addStu = new Scanner(System.in);
		int action = addStu.nextInt();
		//addStu.close();
		
		
		if(action < 0 && action > 1) {
			return;
		}else if(action == 1) {
			//Student newStudent = new Student(id, name, feesPaid, tuition);
			
			System.out.print("Enter student's name: ");
			Scanner sName = new Scanner(System.in);
			//newStudent.setName(sName.nextLine());
			Student.name = sName.nextLine();
			//sName.close();
			
			System.out.print("Fees due by student = $" + tuition + "\n");
			
			System.out.print("Enter amount the student has paid (0 to quit): ");
			Scanner ap = new Scanner(System.in);
			//newStudent.setFeesPaid(ap.nextInt());
			int amountPaid = ap.nextInt();
			//ap.close();
			
			if(amountPaid != 0) {
				payFees(amountPaid);
				
				System.out.println(name + " has paid $" + feesPaid);
				
				//updateTotalFundsEarned();
				tuition = getRemainingFees();
				System.out.println(name + " now owes $" + tuition);
				System.out.println("---------------------------------------------------------");
				
				//studentList.add(newStudent);
			} 
		
		}
		
		//getRemainingFees();
	}
	


//-----------------v-GETTERS-v-----------------------
	
	/**
	 * @return the id of the student
	 */
	public static int getId() {
		return id;
	}


	/**
	 * @return the name of the student
	 */
	public static String getName() {
		return name;
	}


	/**
	 * @return the fees paid by the student
	 */
	public static int getFeesPaid() {
		return feesPaid;
	}


	/**
	 * @return the total fees of the student
	 */
	public static int getTuition() {
		return tuition;
	}

	/**
	 * @return the remaining fees after student pays
	 */
	public static int getRemainingFees() {
		return tuition - feesPaid;
	}
	
//-----------------v-SETTERS-v-----------------------
	

	/**
	 * @param feesPaid the feesPaid to set
	 * 
	 *  When a student pays a part or their whole charge of tuition fees
	 *  it will add/update with each transaction and set a new value to feesPaid
	 *  school receives these payments to run their school
	 *  fees variable represents the individual payment a student makes in one transaction
	 */
	public static void payFees(int amountPaid) {
		feesPaid += amountPaid;
		School.updateTotalFundsEarned(feesPaid);
	}
	
	
	public static void setRemFees() {
		//tuition - feesPaid;
		getRemainingFees();
	}
	
	private void setName(String nextLine) {
		// TODO Auto-generated method stub
		
	}
	
	private void setFeesPaid(int nextInt) {
		// TODO Auto-generated method stub
		
	}

	

}
