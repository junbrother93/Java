package github.junbrother93.classintroduction;

class Calculator{	// 메소드의 간소화
	public int left;
	public int right;
	public void sum() {
		System.out.println(left+right);
	}
	public void avg() {
		System.out.println((left+right)/2);
	}
}

// 상속
class CalculatorMultiplicationable extends Calculator{
	public void multiply() {
		System.out.println(left*right);
	}
}

class Employee{
	public static int period;
	public static int right;
	public static void sum(int period, int right) {
		System.out.println("급여: "+ right*period);
	}
}

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		
		c1.left = 10;
		c1.right = 20;
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		
		c2.left = 100;
		c2.right = 200;
		c2.sum();
		c2.avg();
		
		Employee.period = 2;
		Employee.right = 5000;
		Employee.sum(Employee.period, Employee.right);
		
	}

}
