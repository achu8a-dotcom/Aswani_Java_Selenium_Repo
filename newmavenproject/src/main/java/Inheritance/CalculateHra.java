package Inheritance;

public class CalculateHra extends SalaryDetails{
	
	protected double hra;
	protected double pf;
	
	public void salarycalc(double basic)
	{
		hra=(super.basic*5)/100;
		pf=(super.basic*20)/100;
		
	}

	

}
