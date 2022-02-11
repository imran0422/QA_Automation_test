package encapsulationTest;

public class EmpInfo {
	private int SSN;
	private String empname;

	public void setSSN(int SSN) {
		this.SSN = SSN;
	}

	public int getSSN() {
		return SSN;

	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpname() {
		return empname;
	}
	public void result() {
		System.out.println(getEmpname());
		System.out.println(getSSN());
	}
	public static void main(String[] args) {
		EmpInfo obj1 = new EmpInfo();
		obj1.result();
	}
}
