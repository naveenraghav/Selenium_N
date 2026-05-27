package codingProgram;

import java.util.Scanner;

public class CountNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner ui = new Scanner(System.in)) {
			System.out.println("Enter a number : ");
			
			int n = ui.nextInt();
			int c=0;
			
			if(n==0)
			
			 {
				c++;
			}
			else
			{
				while((n>0)) {
				n=n/10;
				c++;
				}
			}
			System.out.println(c);
		}
	}

}
