package LambdaExpression;

public class Employee {
	 int employeeId;
	 int employeeSalary;
	 String employeeName;
	 
	 Employee(int id, int salary, String name){
		 this.employeeId=id;
		 this.employeeSalary=salary;
		 this.employeeName=name;
	 }
	 
	 
	 public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public int getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String toString() {
		return employeeName+" "+employeeId+" "+employeeSalary;}

}
