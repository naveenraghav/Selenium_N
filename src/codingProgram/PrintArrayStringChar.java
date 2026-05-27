package codingProgram;

import java.util.Arrays;

public class PrintArrayStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		String s = ("Welcome Java Automation testing with Selenium webdriver and TestNG");
		char c= ('a');
		System.out.println(Arrays.toString(a));
		System.out.println(s);
		System.out.println(c);
		
		System.out.println(s.length());
		System.out.println(s.replace("Java","To"));
		System.out.println(s.charAt(4));
		String s1=(" Hello! ");
		System.out.println(s1.concat(s));

	}

}
