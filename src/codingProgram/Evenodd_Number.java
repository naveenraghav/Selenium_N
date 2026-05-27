package codingProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Evenodd_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc= new Scanner(System.in);
		//System.out.println("Enter size of an array");
		//int n=sc.nextInt();
		int a[]= {1,2,3,5};
		System.out.println(Arrays.toString(a));
		int even=0;
		int odd=0;
		for(int i=0;i<=3;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else {
				odd++;
			}
		}
		
		System.out.println("Even No in array : "+even);
		System.out.println("Odd Number In the array : "+odd);
		
		//sc.close();

	}

}
