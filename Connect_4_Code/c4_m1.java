public class c4_m1  // class declaration
{
  public static boolean valid_board_square(char valid_character) // method declaration
	{			
		if ((valid_character=='R' ) || (valid_character=='Y') || (valid_character=='.'))  //checks if the character entered on the board is valid
		{
		  return true;	// valid input,   if c is a valid [correct] character then true should be returned
		}
		
		return false; // alternate invalid input, if c is an invalid [incorrect] character then false should be returned
	} 
	
	public static void main(String[] args) //main method used to check the rest of the code (main method declaration)
	{
		  boolean valid = valid_board_square('R');   //adds method input and checks if the code is correct
		  
		  if (valid == true)  // checks if the code and token used on the board by the player is correct
		  {
			System.out.println("Your input is valid"); // when the character entered is correct
		  }
		  
		  else
		  {
			  System.out.println("Your input is not valid"); // when the character entered is incorrect
		  }
	} 
} 
