package github.junbrother93.method;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numbering(1, 5));
		}
	
	
	public static String numbering(int init, int limit) {
		String output = "";
		while(init<limit){
			System.out.println(init);
			output += init;
			init++;
		}
		return output;
	}
}
