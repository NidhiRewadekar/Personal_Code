public class P7_Fibonacci_Sequence 
{
	public static void Fibonacci_Sequence(int number)
	{
		int number1=0, number2=1, number3;
		
		int num_counter=0;
		
		while (num_counter<number)
		{
			System.out.println(number1+"");
			
			number3=number1+number2;
			number1=number2;
			number2=number3;
			num_counter++;
		}
	}
	
	public static void main(String[] args) 
	{
       Fibonacci_Sequence(40);
	}
}
