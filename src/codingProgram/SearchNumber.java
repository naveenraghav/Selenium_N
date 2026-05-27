package codingProgram;

public class SearchNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,30,40,50};
		int search_num=3;
		
		boolean status= false;
		for(int i=0;i<=3;i++)
		{
			if(a[i]==search_num)
			{
				System.out.println("Number Found");
				status= true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Num Not Found");
		}

	}

}
