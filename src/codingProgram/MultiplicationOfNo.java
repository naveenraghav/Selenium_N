package codingProgram;

public class MultiplicationOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=12345;
		int newNo = 1;
		
		while(n>0) {
			int temp= n%10;
			newNo= newNo*temp;
			n=n/10;
		}
		System.out.println(newNo);

	}

}
