package JavaBasicCoding;

public class EmployeeDataEncapPract {
	
	//private data variables:
	private int ssn;
	private String empName; 
	private int empAge;
	
	
	//Getter and Setter methods:--> to create that right click Source-->Generate Getters and Setters 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDataEncapPract emp = new EmployeeDataEncapPract();
		emp.setEmpName("Tom");
		emp.setEmpAge(12);
		emp.setSsn(655555555);
		System.out.println("Emp Name : "+ emp.getEmpName());
		System.out.println("Emp Age : "+ emp.getEmpAge());
		System.out.println("Emp SSN : "+ emp.getSsn());
		System.out.println();
		
	}


	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
