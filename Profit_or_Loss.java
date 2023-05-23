public class P3_Profit_Or_Loss 
{
	public static void Profit_Or_Loss(double cost_price, double selling_price)
	{
		double profit=0;
		double profit_percent=0;
		double loss=0;
		double loss_percent=0;
		
		if(cost_price>selling_price)
		{
			System.out.println("We have incurred a loss");
			loss=cost_price-selling_price;
			System.out.println("Loss incurred:"+loss);
			
			loss_percent=(loss/cost_price)*100;
			System.out.println("Loss percentage:"+loss_percent);
		}
		
		else if(selling_price>cost_price)
		{
			System.out.println("We have received a profit");
			profit=selling_price-cost_price;
			System.out.println("Profit recieved:"+profit);
			
			profit_percent=(profit/cost_price)*100;
			System.out.println("Profit percentage:"+profit_percent);
		}
		
		else 
		{
			System.out.println("CP & SP is the same");
		}	   	
	}
	
	public static void main(String[] args) 
	{
		Profit_Or_Loss(1600, 1600);
	}
}
