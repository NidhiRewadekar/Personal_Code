public class Built_In_Mathematical_Functions {
	public static void main(String args[])
	{
		RoundingTest(19.8);
		
	}
	
	private static void RoundingTest(double x) 
	{
		
		double y=Math.floor(x); // rounds it to the lower number
		System.out.println(y);
		
		double z=Math.ceil(x);
		System.out.println(z); // rounds it to the higher number
		
		double a=Math.round(x);
		System.out.println(a); // does basic mathematical rounding
		
	}

}
