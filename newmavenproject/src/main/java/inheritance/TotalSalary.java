package inheritance;
public class TotalSalary extends CalculateHra{
	
	double totalsal;
	
	public void totalsalarys()
	{
		totalsal=basic+hra-pf-deduction+bonus;
	}
	
	public void displaysalaryslip()
	{System.out.println("Employee Basic Pay is: " +basic);
	System.out.println("Employee Deduction is: " +deduction);
	System.out.println("Employee Bonus is: " +bonus);
	System.out.println("Employee HRA is: " +hra);
	System.out.println("Employee PF is: " +pf);
	System.out.println("Employee Total Salary is: " +totalsal);
	}
	public static void main(String args[]) {
		
TotalSalary t=new TotalSalary();
t.salary();
t.salarycalc();
t.totalsalarys();
t.displaysalaryslip();
	}

}
