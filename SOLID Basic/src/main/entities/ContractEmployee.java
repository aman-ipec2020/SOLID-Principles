package main.entities;

public class ContractEmployee extends Employee {

	public ContractEmployee()	{
		
	}
	
	public ContractEmployee(String id, String name)	{
		super(id,name);
	}
	
	@Override
	public float calculateBonus(float salary){
		return 0;
	}

}
