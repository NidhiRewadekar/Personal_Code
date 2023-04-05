import java.util.Arrays;

public class Arrays
{

	public static void main(String[] args) 
	{
		String [] names= {"Sam", "Jas", "Lola"};
		
		for(int i=0; i<names.length; i++)
		{
		System.out.println(names[i]);
		}
		
		System.out.println("----------------------------");
		
		Arrays.sort(names);
		
		for(int j=0; j<names.length; j++)
		{
		System.out.println(names[j]);
		}
		


	}

}
