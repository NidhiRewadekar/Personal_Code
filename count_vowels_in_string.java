public class count_vowels_in_string 
{

public static void main(String[] args) 
{

count_vowels("All cows eat grass and moo");
}

public static int count_vowels(String str)
{
	int count_of_vowels=0;
	
	String str_lower_case=str.toLowerCase();
	
	for(int i=0; i<str_lower_case.length(); i++)
	{
		char char_str_index = str_lower_case.charAt(i);
		
		if(char_str_index=='a'|| char_str_index=='e'|| char_str_index=='i'|| char_str_index=='o'|| char_str_index=='u')
		{
			count_of_vowels++;
		}
	}
	
	System.out.println("Number of vowels in given statement:"+count_of_vowels);
	
	return count_of_vowels;
	
}
