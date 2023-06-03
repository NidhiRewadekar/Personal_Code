public class P11_HCF_Calculator 
{
	public static int HCF_Calculator(int num1, int num2)
	{
		int num3=num1-num2;
		int num4=num2-num1;
		
	  if(num1==0)
		 {
			return num2;
		 }
	  
	  else if(num2==0)
	   {
		 return num1;
	   }
	  
	  else if(num1==num2)
	   {
		 return num1;
	   }
	  
	  else if(num1>num2)
	  {
		  return HCF(num3, num2);
	  }
		return HCF(num1, num4);
	}
	public static void main(String[] args) 
	{
		int num1=16;
	  int num2=8;
	    System.out.println("The HCF of num1 and num2 is:"+HCF(num1, num2));
	}
}
