package main.LSP.entities;

public abstract class Employee implements EmployeeBonus, EmployeeSalary{

	String id = null;
	String name = null;
	float salary = 0;
	
	public Employee()	{	}
	
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void setId(String id) 				{	this.id = id;			}
	public void setName(String name) 			{	this.name = name;		}
	public void setSalary(float salary)			{	this.salary = salary;	}
	
	public String getId() 			{	return id;				}
	public String getName()			{	return name;			}
	
	public abstract float calculateBonus(float salary);

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}	
}
