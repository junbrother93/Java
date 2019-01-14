package github.junbrother93.method;

public class Method {

	public static String numbering(int init, int limit) {
		String output = "";
		while(init<limit){
			System.out.println(init);
			output += init;
			init++;
		}
		return output;
	}
	
	public static String[] getMembers() {
		String[] members = {"이준형", "김자영"};
		return members;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] members = getMembers();
		
		System.out.println(numbering(1, 5));
		System.out.println(members[0] + members[1]);
		}
}
