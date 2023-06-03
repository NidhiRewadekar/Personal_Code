public class P10_LCM_Calculator 
{
public static int HCF_Calculator(int num1, int num2)
{
   if(num1==0)
   {
	 return num2;
   }
  
   return HCF_Calculator(num2%num1, num1);
}

public static int LCM_Calculator(int num1, int num2)
{
   return (num1/HCF_Calculator(num1, num2))* num2;
}

public static void main(String[] args) 
	{
	    int num1=6;
	    int num2=3;
	    System.out.println("The LCM of num1 and num2 is:"+LCM_Calculator(num1, num2));
	}
}
