public class P1_Swap_Value_Without_New_Variable 
{
	public static void Swap()
	{
		int x=10;
		System.out.println("Value of x:"+x);
		
		int y=0;
		System.out.println("Value of y:"+y);
		
		x=y;
		System.out.println("Value of x now:"+x);
	}

	public static void main(String[] args) 
	{
		Swap();
	}
}
