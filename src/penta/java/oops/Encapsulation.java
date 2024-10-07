package penta.java.oops;

class Employee
{
	private String empId;
	private String empName;
	private String dept;
	private double salary;
	private String company;
	
	public void setEmpId(String empId)
	{
		this.empId=empId;
	}
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}
	
	public String getEmpId()
	{
		return empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public String getDept()
	{
		return dept;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getCompany()
	{
		return company;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		
		Employee emp1=new Employee();
		emp1.setEmpId("PS-1001");
		emp1.setEmpName("Karthik");
		emp1.setDept("Development");
		emp1.setSalary(50000);
		emp1.setCompany("PlayStation");
		
		System.out.println("Employee Id : "+emp1.getEmpId());
		System.out.println("Employee Name : "+emp1.getEmpName());
		System.out.println("Employee Dept : "+emp1.getDept());
		System.out.println("Employee Salary : "+emp1.getSalary());
		System.out.println("Company : "+emp1.getCompany());
		

	}

}
