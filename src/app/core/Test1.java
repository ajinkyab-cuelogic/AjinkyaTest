package app.core;

public class Test1 {
	
	/*public static String missingChar(String str, int n)
	{
		 
		 String front = str.substring(0, n);
		 System.out.println("front"+front);
		 String back = str.substring(n+1, str.length());
		  System.out.println("back"+back);
		  return front + back;
	}*/
	public void pattern1(int num)
	{
		int i , j,k;
	
		for(i = 1 ; i <= num; i++ )
		{
		
			for(j = 1; j <= i*2-1 ; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public  void pattern2(int num)
	{
		int i , j,k;
		
		for(i = 1 ; i <= num; i++ )
		{
			for(k = 4 ; k >= i*2-1 ; k--)
			{
				System.out.print(" ");
			}
			
			for(j = 1; j <= i*2-1 ; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}
	
	public void pattern3(int num)
	{
		int i,j,k,x;
		for(i = 1; i <= num ;  i++)
		{

			for(k = num ;k > i ;k--)
			{
				System.out.print(" ");
			}
			
			for(j=1 ;j <= i ;j++)
			{
				System.out.print(i);
			}
			for(x = 1;x < i; x++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	  /*1234567
		234567
		34567
		4567
		567
		67
		7*/
		
	public void pattern4(int num)
	{
		int i,j,k;
		for(i = 1; i <= num; i++)
		{
			for(j = i; j <= num ; j++ )
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

	
	public static void main(String args[])
	{
		int num = 3;
		Test1 test = new Test1();
		test.pattern1(num);
		System.out.println();
		test.pattern2(num);
		System.out.println();
		test.pattern3(num);

		System.out.println();
		test.pattern4(10);


	}
		


}
