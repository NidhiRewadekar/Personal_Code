import java.util.Scanner;

public class P4_Read_Input 
{
	public static void Read_Input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name=sc.next();
		
		System.out.println("Please enter a number: ");
		int num_1=sc.nextInt();
		
		System.out.println("Please enter another number: ");
		int num_2=sc.nextInt();
		
		int add, subtract, multiply, divide;
		
		add=num_1+num_2;
		System.out.println("The sum of numbers you input is:"+add);
		
		subtract=num_1-num_2;
		System.out.println("The difference of numbers you input is:"+subtract);
		
		multiply=num_1*num_2;
		System.out.println("The product of numbers you input is:"+multiply);
		
		divide=num_1/num_2;
		System.out.println("The division of numbers you input is:"+divide);
	}
	
	public static void main(String[] args) 
	{
		Read_Input();
	}
}
