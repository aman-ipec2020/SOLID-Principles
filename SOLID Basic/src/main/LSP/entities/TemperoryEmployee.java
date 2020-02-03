package main.LSP.entities;

public class TemperoryEmployee extends Employee {

	public TemperoryEmployee() {	}
	public TemperoryEmployee(String id, String name, float salary) {
		super(id,name);
		this.salary = salary;
	}
	
	@Override
	public float calculateBonus(float salary) {
		return (salary * 5)/100;
	}
	
	@Override
	public float getSalary() {
		return this.salary;
	}
	@Override
	public String toString() {
		return "TemperoryEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
