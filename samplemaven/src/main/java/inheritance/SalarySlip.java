package inheritance;

public class SalarySlip extends SalaryComponents
{
	double totalSalary;
	public void calculateSalarySlip()
	{
		 totalSalary = basicPay + hra - pf - deduction + bonus;
	}
		 public void displaySalarySlip() {
		System.out.println("SalarySlip:");
		System.out.println("-----------------------");
		System.out.println("Basic Pay: " + basicPay);
		System.out.println("HRA: " + hra);
		System.out.println("PF: " + pf);
		System.out.println("Deduction: " + deduction);
		System.out.println("Bonus: " + bonus);
		System.out.println("TotalSalary: " + totalSalary);
	}
public static void main(String[] args) {
SalarySlip employee=new SalarySlip();
employee.calculateComponents();
employee.calculateSalarySlip();
employee.displaySalarySlip();
}
}
