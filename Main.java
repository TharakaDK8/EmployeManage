
public class Main {

	public static void main(String[] args) {
		

			Employee emp1= new Employee(45,"dsdsd",23,23.4,45.6,45.7,25.7);
			emp1.calcNetSalary();
			emp1.displayNetSalary();
			
			Employee emp2= new Employee(46,"fgdfg",45,364.4,457.6,453.7,255.7);
			emp2.calcNetSalary();
			emp2.displayNetSalary();
			
			Director d1=new Director(34,"yrtygf",34,45.6,56.7,47.8,45.7,56.8);
			d1.calcNetSalary();
			d1.displayNetsalary();
			
			Director d2=new Director(36,"ertreg",38,455.6,567.7,473.8,454.7,569.8);
			d2.calcNetSalary();
			d2.displayNetsalary();
			
			Manager m1=new Manager(23,"dfffg",34,45.4,56.4,58.5,78.4,97.6,58.9);
			m1.calcNetSalary();
			m1.displayNetSalary();
			
			Manager m2=new Manager(25,"tryrty",37,456.4,566.4,586.5,786.4,977.6,587.9);
			m2.calcNetSalary();
			m2.displayNetSalary();
	}

}
