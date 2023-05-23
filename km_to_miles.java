public class P2_km_to_miles 
{
	public static void km_to_miles(double km)
	{
		double miles=km*1.6;
		System.out.println("Value in km:"+ ""+km+" km");
		System.out.println("Value in miles:"+ ""+miles+" miles");
	}
	
	public static void main(String[] args) 
	{
    int check_conversion=10;
		km_to_miles(check_conversion);
	}
}
