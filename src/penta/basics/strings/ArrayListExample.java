package penta.basics.strings;

import java.util.ArrayList;

class Employee
{
	int empId;
	String empName;
	double salary;
	int age;
	String designation;
	public Employee(int empId, String empName, double salary, int age, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.age = age;
		this.designation = designation;
	}
	void disp()
	{
		System.out.println("Emp Id: "+this.empId);
		System.out.println("Emp Name: "+empName);
		System.out.println("Salary : "+salary);
		System.out.println("Age : "+age);
		System.out.println("Designation : "+designation);
	}
//	@Override
//	public String toString()
//	{
//		
//		return "[ Emp Id: "+empId+" Emp Name: "+empName+" Salary : "+salary+
//				" Age : "+age+" Designation "+designation+"]\n";
//	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", age=" + age
				+ ", designation=" + designation + "]\n";
	}
	
	
}
public class ArrayListExample {

	public static void main(String[] args) {
		
			Employee e1= new Employee(108,"Shilpa",20,82,"Developer");
			Employee e2= new Employee(420,"Faizan",20000,16,"BabySitter");
			Employee e3= new Employee(840,"Jinendra",2,18,"Trainer");
			Employee e4= new Employee(238,"Harshitha",99999,25,"Scientist");
//			System.out.println(e1);
			
			ArrayList<Employee> emplist=new ArrayList<>();
			
			emplist.add(e1);
			emplist.add(e2);
			emplist.add(e3);
			emplist.add(e4);
			System.out.println(emplist);
			
			for(Employee e:emplist)
			{
				e.disp();
			}
			
	}

}
