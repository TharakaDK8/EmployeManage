
public class Employee {

	protected int Empno;
	protected String Name;
	protected int telephone;
	protected double basicsalary;
	private double othrs;
	private double otrate;
	protected double netSalary;

public Employee(int Empno,String Name,int telephone, double basicsalary, double othrs,double otrate,double netSalary) {
	this.Empno=Empno;
	this.Name=Name;
	this.telephone=telephone;
	this.basicsalary=basicsalary;
	this.othrs=othrs;
	this.otrate=otrate;
	this.netSalary=netSalary;
} 



public double calcNetSalary() {
	
	
	netSalary=basicsalary+othrs*otrate;
	return netSalary;
}
public void displayNetSalary() {
	System.out.println("Employee Net Salary is : "+netSalary);
}
}