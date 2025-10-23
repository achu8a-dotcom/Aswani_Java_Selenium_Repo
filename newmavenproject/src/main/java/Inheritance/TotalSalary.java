package Inheritance;

public class TotalSalary extends CalculateHra{
	
	public double totalsal;
	
	public void totalsalary(double basic,double hra,double pf,double deduction,double bonus)
	{
		totalsal=(basic+hra)-pf-deduction-bonus;
	}
	
	public void displaysalaryslip(double basic,double hra,double pf,double deduction,double bonus,double totalsal)
	{System.out.println("Employee Basic Pay is: " +basic);
	System.out.println("Employee Deduction is: " +deduction);
	System.out.println("Employee Bonus is: " +bonus);
	System.out.println("Employee HRA is: " +hra);
	System.out.println("Employee PF is: " +pf);
	System.out.println("Employee Total Salary is: " +totalsal);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TotalSalary t=new TotalSalary();
t.salary();
t.salarycalc(t.basic);
t.totalsalary(t.basic,t.hra,t.pf,t.deduction,t.bonus);
t.displaysalaryslip(t.basic,t.hra,t.pf,t.deduction,t.bonus,t.totalsal);


	}

}
