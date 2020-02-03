package main.OCP;

import main.entities.Employee;
import main.entities.PermanentEmployee;
import main.entities.TemperoryEmployee;

public class OCPDemo {

	private static Employee emp1 = new PermanentEmployee("EMP-101","Aman",25000);
	private static Employee emp2 = new TemperoryEmployee("EMP-102","Isha",25000);
	
	public static void main(String[] args) {
		System.out.println (emp1.getName() + " : " + emp1.calculateBonus(emp1.getSalary()));
		System.out.println (emp2.getName() + " : " + emp2.calculateBonus(emp2.getSalary()));
	}
}
