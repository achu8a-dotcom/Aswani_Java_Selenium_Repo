package Inheritance;
import java.util.Scanner;

public class SalaryDetails {
	
	protected double basic;
	protected double deduction;
	protected double bonus;
	
	public void salary()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Basic pay");
		double basic=scan.nextDouble();
		System.out.println("Enter the Deduction Amount");
		double deduction=scan.nextDouble();
		System.out.println("Enter the Bonus Amount");
		double bonus=scan.nextDouble();
		scan.close();
	}


}
