
public class Manager extends Employee {

	protected double allowances;
	protected double deductions;
	
	
	public Manager(int Empno, String Name, int telephone, double basicsalary, double othrs, double otrate,double allowances,double deductions,
			double netSalary) {
		super(Empno, Name, telephone, basicsalary, othrs, otrate, netSalary);
		// TODO Auto-generated constructor stub
		this.allowances=allowances;
		this.deductions=deductions;
	}
	
	

	
	
public double calcNetSalary(double al,double ded) {
	
	
	netSalary=basicsalary+allowances-deductions;
	return netSalary;
}
public void displayNetSalary() {
	System.out.println("Manager Net Salary is : "+netSalary);
}
}
