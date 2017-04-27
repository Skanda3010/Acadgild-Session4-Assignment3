import java.util.Scanner;

public class PrintEmpDetailsAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDetails empDet = new EmployeeDetails();
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Please enter the employee details below");
		
		System.out.println("Enter Name :");
		empDet.setName(sc.next());
		
		System.out.println("Enter you ID");
		empDet.setID(sc.nextInt());
		
		System.out.println("Enter your Date of Birth in DD/MM/YYYY format");
		empDet.setDateOfBirth(sc.next());
		
		System.out.println("Enter your Phone Number");
		empDet.setMobileNumber(sc.next());
		
		sc.close();
		
		System.out.println("The details of the employee are:\n"
				+ "Name : "+empDet.getName()+"\n"
				+"ID : "+empDet.getID()+"\n"
				+"Date Of Birth : "+empDet.getDateOfBirth()+"\n"
				+"Phone Number : "+empDet.getMobileNumber());
		
	
				
		

	}

}
