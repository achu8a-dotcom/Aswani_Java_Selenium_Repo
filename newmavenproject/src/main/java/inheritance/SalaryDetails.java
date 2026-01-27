package inheritance;
import java.util.Scanner;

public class SalaryDetails {
	
	double basic;
	double deduction;
	double bonus;
	
	public void salary()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Basic pay");
		basic=scan.nextDouble();
		System.out.println("Enter the Deduction Amount");
		deduction=scan.nextDouble();
		System.out.println("Enter the Bonus Amount");
		bonus=scan.nextDouble();
		scan.close();
	}


}
