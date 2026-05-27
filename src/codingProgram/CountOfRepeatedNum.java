package codingProgram;

public class CountOfRepeatedNum {
	public static void main(String arg[])
	{
		int a[] = {1,3,3,4,5,6,3};
		int n=3, count=0;
		for(int i=0; i<=6;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
