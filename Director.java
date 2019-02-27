
public class Director extends Manager {

	protected  double bouns;
	protected  double entertainmentAllowance;
	
	public  Director(int Empno, String Name, int telephone, double basicsalary, double allowance, double deductions, double bouns,double entertainmentAllowance) {
			super(telephone, Name, telephone, entertainmentAllowance, entertainmentAllowance, entertainmentAllowance, entertainmentAllowance, entertainmentAllowance, entertainmentAllowance);
	
		this.bouns=bouns;
		this.entertainmentAllowance=entertainmentAllowance;
	}
public double calcNetSalary() {
	
	netSalary=basicsalary+allowances+deductions+bouns+entertainmentAllowance;
	return netSalary;
}
public void displayNetsalary() {
	
	System.out.println("Director Net Salary is : "+netSalary);
}
}

