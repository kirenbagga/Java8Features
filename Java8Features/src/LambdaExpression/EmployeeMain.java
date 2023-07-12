package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e=new Employee(101,10000,"Ravu Raju");
		System.out.println(e.toString());  //=System.out.println(e);
		System.out.println(e.getEmployeeName());
		
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(104, 12000, "kirna"));
		emp.add(new Employee(103, 13000, "ashok"));
		emp.add(new Employee(102, 12000, "umesh"));
		emp.add(new Employee(105, 15000, "ucchu"));
		System.out.println(emp);
		//based on id no
		Comparator<Employee> c=(r1,r2)->(r1.employeeId<r2.employeeId)?-1:(r1.employeeId>r2.employeeId)?1:0;
		Collections.sort(emp, c);
		System.out.println(emp);
		//based on name
		Collections.sort(emp, (e1,e2)->e1.employeeName.compareTo(e2.employeeName));
		System.out.println(emp);
		//based on salary
		Collections.sort(emp, (s1,s2)->(s1.employeeSalary<s2.employeeSalary)?-1:(s1.employeeSalary>s2.employeeSalary)?1:0);
		System.out.println(emp);
		System.out.println(emp.get(1));



	}

}
