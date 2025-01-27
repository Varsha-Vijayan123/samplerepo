package inheritance;

public class SalaryComponents extends EmployeeDetails {
	double hra;
	double pf;
	public void calculateComponents() 
	{
	hra=0.05*basicPay;
	pf=0.20*basicPay;
}
}
