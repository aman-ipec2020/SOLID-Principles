package main.entities;

public class PermanentEmployee extends Employee {

	public PermanentEmployee() {	}
	public PermanentEmployee(String id, String name, float salary) {
		super(id,name);
		this.salary = salary;
	}
	
	@Override
	public float calculateBonus(float salary)	{
			return (salary * 10)/100;
	}
	
	
	@Override
	public String toString() {
		return "PermanentEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
