//imports all the statements needed for the class to run

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class c4_m3 // class declaration
{
	public static boolean valid_move (char column_number, char[][] valid_board_declare)   // method declaration
	{	
		//if(valid_board_declare==null)  // test works
		//{
			//System.out.println("Null board"); // if the board is null
			//return false;
		//}
		
		if(valid_board(valid_board_declare)==true)  // checks if the board is valid, test works
		 {
		 if ((column_number>='0') && (column_number<='6'))  // checks if the column numbers of the board are valid, test works
		  {
		  System.out.println("You have entered a valid column number"); // if column number is valid
		   return true;
		 }
		 }
		  
		 if(valid_board(valid_board_declare)==false)  // the board is invalid, test works
		 {
		 System.out.println("You have entered an invalid board");
		  return false; //if the board is wrong (invalid) then false should be returned
		 }
		 System.out.println("You have entered an invalid column number");
		  return false;    //if the column [col] is wrong (invalid) then false should be returned
	}
	
	public static boolean valid_board(char[][] valid_board_declare)   //  method declaration
	{	//test 1	
		if (valid_board_declare==null)  // checks if the array is null
		{   
			System.out.println("Null board"); // if the board is null
			return false; // invalid statement due to invalid input
		} // works correctly
		
		if (valid_board_declare!=null)  // checks if the array is not null
		{
			int number_of_rows = valid_board_declare.length; // checks the number of rows of the double array
			System.out.println("Number of rows are:" + number_of_rows);  // prints the number of rows of the double array
			
			int number_of_columns= valid_board_declare[0].length; // checks the number of columns of the double array
		    System.out.println("Number of columns are:" + number_of_columns);   // prints the number of columns of the double array
			
			if (((number_of_rows==6) && (number_of_columns==7)))    // checks if the number of rows and columns of the double array are valid	
		    {	
				// making a nested for loop to go through the entire board for valid characters and red & yellow tokens
				int r_count=0, y_count=0; // declares the var for red & yellow tokens
				
				for(int i=0;i<valid_board_declare.length;++i)   // loops through the number of rows present on the board
				{
					for(int j=0;j<valid_board_declare[i].length;++j)    // loops through the number of columns present on the board		
					{
						char c = valid_board_declare[i][j];  //loops throughout the entire board
						
						if(c=='R')  // checks if the board has a red token
						{
							r_count++; // increases total number of red tokens
						}
						
						if (c=='Y')  // checks if the board has a yellow token
						{
							y_count++; // increases total number of yellow tokens
						}
					
						if(valid_board_square(c)==false)   // to check for invalid characters
						{
							System.out.println("Characters are invalid");
							return false;
						}	
					}
					
				}   // end of nested for loop

				System.out.println("r_count: " + r_count); // total number of red tokens
				System.out.println("y_count: " + y_count); // total number of yellow tokens
						 
						if((r_count != y_count+1) && (r_count!=y_count))   // check that red greater than 1 or equal to yellow
                            {
							 System.out.println("invalid number of red/yellow tokens");    
                             return false; 
                            }  
						
						for(int a=0;a<=valid_board_declare.length-1;++a)  // loops through the number of rows
						{
							for(int b=0;b<valid_board_declare[a].length;++b)   // loops through the number of columns
							{
								char d = (char) valid_board_declare[a][b];   // goes through the entire board and checks all of the elements present in it.		
								char e = '\0' ;	// declares a null char							

								if ((a>=0) && (a<valid_board_declare.length-1))
								{
									e = (char) valid_board_declare[a+1][b];	// checks the rows below d							
								}
							System.out.print(d);   // prints the entire board
								
							if((d=='R') ||(d=='Y'))  // either a red or yellow token
								{		
									if(e=='.')  // checks if there is an empty space below a red or yellow token
									{
										System.out.println("Empty space found below...");
										return false; // incorrect position of the token
									}
								}								
							}
							System.out.println(); // prints an empty line
						}  // end of nested for loop			
		    } 
			else
			{
				System.out.println("Invalid board size"); 
				return false; // incorrect board size  
			}
					}
					
		return true;  //If Tests 1 and 2 are passed then the method should return the correct answer on test data (board)
				} // ends the method
	
		public static boolean valid_board_square(char valid_character) // method declaration
		{	
			if ((valid_character=='Y' ) || (valid_character=='R') || (valid_character=='.'))  // checks if a character on the board is valid or not
			{
			  return true;	// valid input
			}		
			return false;	// invalid input
		}
			
	public static void main(String[] args) throws Exception // main method to check the code
	{
		 char b1[][] = ReadBoard("B6.txt"); 
		PrintBoard(b1); // prints the sample boards
		
		boolean valid= valid_board(b1);  // checks if the board is valid or not, prints once
		boolean valid_check =valid_move('8', b1); // prints twice
		
		if(valid== true) // if the board is valid
		{
			System.out.println("Your board is valid"); // the code is correct and valid
		}
		
		else // if the board is invalid
		{
			System.out.println("Your board is not valid"); // the code is incorrect and/or invalid
		}		
		
		if(valid_check== true) // if column is valid
		{
		System.out.println("Your column is valid"); // the code is correct and valid
	    }
		
		else // if the board is invalid
		{
			System.out.println("Your column is not valid"); // the code is incorrect and/or invalid
		}		
	}

	private static char[][] ReadBoard(String fn) throws Exception
	{
		ArrayList<String> x = (ArrayList<String>) Files.readAllLines(Paths.get(fn));		// used to read the text files containing the boards
		char res[][] = new char[x.size()][x.get(0).length()];
		
		for(int i=0;i<x.size();++i)  // loops through the rows
		{
			for(int j=0;j<x.get(i).length();++j)  // loops through the columns
			{
				res[i][j] = x.get(i).charAt(j);  // gets the character at a particular element on the board
			}
		}	
		return res;  //returns the char at a particular element on the board
	}
	
	private static void PrintBoard(char board[][])  //loops through the entire board
	{	
		for(int i=0;i<board.length;++i) // loops through the rows
		{
			for(int j=0;j<board[i].length;++j)  // loops through the columns
			{
				char c = board[i][j];  // checks every element of the board
				System.out.print(c);   // prints the board
			}
			System.out.println();  // prints an empty line
		}		
	}
}
