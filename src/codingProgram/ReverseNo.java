package codingProgram;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner ui = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int number=ui.nextInt();
			
			int newNumber= number;
			int reverse= 0;
					
			while(number>0) {
				
			int temp=number%10;
			reverse = reverse*10+temp;
			number = number/10;
				}
			
			if (newNumber == reverse) {
			    System.out.println("Palindrome");
			} else {
			    System.out.println("Not Palindrome");
			}
		}

	}

}
