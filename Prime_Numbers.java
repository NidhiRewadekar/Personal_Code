public class P8_Prime_Numbers 
{
	public static void Prime_Numbers(int number)
	{
		System.out.println("The number is: "+number);
		
		int divided_number=0;
		divided_number=number/2;
		
		int flag=0;
		
		if((number==0)||(number==1))
		{
			System.out.println("The number is not a prime number");
		}
		
		else
		{
		   	for(int a=2; a<=divided_number; a++)
		   	{
		   		if(number%a==0)
		   		{
		   		   flag++;	
		   		   System.out.println("The number is not a prime number");
		   		   break;
		   		}
		   	}
		   	
		   	if(flag==0)
		   	{
		   		System.out.println("The number is a prime number");
		   	}
		}
	}
	
	public static void main(String[] args) 
	{
		Prime_Numbers(79);
	}
}
