package codingProgram;

public class HowManyTimesNoRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,2,2,5,6};
		int n=2;
		int count=0;
		for(int i=0;i<=5;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		
		System.out.println("Number of Count appear in array : "+count );
	}

}
