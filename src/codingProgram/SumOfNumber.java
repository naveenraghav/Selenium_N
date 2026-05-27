package codingProgram;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc= new Scanner(System.in)){
			
			int ui= sc.nextInt();
			int r=0;
			while (ui>0) {
				
				int temp= ui%10;
				r=r+temp;
				ui=ui/10;
			}
			
			System.out.println(r);
		}

	}

}
