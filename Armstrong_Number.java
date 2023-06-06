public class P12_Armstrong_Number 
{
 public static void Armstrong_Number(int num1, int num2)
 {
	 System.out.println("The numbers chosen are: "+ num1+ " "+ "and"+ " "+num2);
	 System.out.println("The armstrong numbers are:");
	 
	 int num3=num1+1;
	 
	for(int i=num3; i<num2; ++i) 
	{
		int j=i;
		int number = 0;
		int power_of_number=0;
		
		while(j!=0)
		{
			j/=10;
			++number;
		}
		
		int modulo_num=0;
		j=i;
		
		while(j!=0)
		{
		  modulo_num=j%10;
		  power_of_number+=Math.pow(modulo_num, number);
		  j/=10;
		}
		
		if(power_of_number==i)
		{
			 System.out.println(i + " ");
		}
	}
 }
	public static void main(String[] args) 
	{
        Armstrong_Number(0, 1000);
        System.out.println();
	}
}
