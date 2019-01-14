package github.junbrother93.scope;

class Cal{
	static double PI = 3.14;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOprands2(int _left, int _right) {
		left = _left;
		right = _right;
	}
	
	public void sum()
	{
		System.out.println(this.left + this.right);
	}
	
	public void avg()
	{
		System.out.println((this.left+this.right)/2);
	}
}

public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal C = new Cal();
		C.setOprands(3, 5);
		C.sum();
		C.avg();
		C.setOprands2(3, 7);
		C.sum();
		C.avg();
	}

}
