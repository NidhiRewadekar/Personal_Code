public class P1_Swap_Value_With_New_Variable 
{
	public static void Swap()
	{
		int temp;
		
		int x=10;
		System.out.println("Value of x:"+x);
		
		int y=0;
		System.out.println("Value of y:"+y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("Value of x after swap:"+x);
		System.out.println("Value of y after swap:"+y);
	}

	public static void main(String[] args) 
	{
		Swap();
	}
}
