public class DataTypeConversion 
{
	public static void main(String[] args) 
	{	
		int x = 10;
		double y = x; // converts the int to a double
		System.out.println(y); // prints the conversion

		double a = 10.3;
		int b = (int)a; 
		System.out.println(b); // the number is rounded down
		
		Long v1 = (long)10;
		Float v2 = (float)10.3;
		System.out.println(v1 + "," + v2);
	}
}
