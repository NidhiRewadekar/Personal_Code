public class P6_Add_2_Binary_Strings 
{
	public static void Add_Two_Binary_Strings(String binary_1, String binary_2)
	{
		int binary1 = Integer.parseInt(binary_1, 2);
		int binary2 = Integer.parseInt(binary_2, 2);
		
		int binary_addition=binary1+binary2;
		
		String binaryadd=Integer.toBinaryString(binary_addition);
		
		System.out.println("The sum of numbers you input are:"+binaryadd);
	}
	
	public static void main(String args[])
	{
		Add_Two_Binary_Strings("1010", "1111");
	}
}
