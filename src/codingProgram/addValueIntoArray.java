package codingProgram;

import java.util.Arrays;
import java.util.Scanner;

public class addValueIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]= new int[5];
//		 a[0]=1;
//		 a[1]=2;
//		 a[2]=3;
//		 a[3]=4;
//		 a[4]=5;
		
		// Taking input through user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		int a[]= new int[size];
		 
		System.out.println("Enter the values of Array :");
		for(int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		 System.out.println(Arrays.toString(a));

	}

}
