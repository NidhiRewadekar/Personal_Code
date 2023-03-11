import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class c4_m4 // class declaration
{
	public static ArrayList<Integer> Q4_ValidMoves(char[][]valid_board_declare) // method declaration
	{
		ArrayList <Integer> moves= new ArrayList<>(); // creates a new arraylist
		
		if(valid_board(valid_board_declare)==false) // test works
		{
			System.out.println("Incorrect board"); // board is invalid
			return null;  //if board is wrong (incorrect) then null should be returned
		} 
			
		if (valid_board(valid_board_declare)==true)// board is valid calls the method, test works
		{
			for(int col_num=0; col_num<=6; col_num++) // number of columns
				{
					if (valid_board_declare[0][col_num]=='.') // checks if the column is empty, test works
					{
						moves.add(col_num); // adds the column numbers to the arraylist
						System.out.println("Available column: " + col_num);
					}  
				}		
		} // if Test 1 is passed then return a list of all the column numbers that a move could be made into
		return moves;
	}
	
	public static boolean valid_board(char[][] valid_board_declare)   //  method declaration
	{	//test 1	
		if (valid_board_declare==null)  // checks if the array is null
		{   
			System.out.println("Null board"); // if the board is null
			return false; // invalid statement due to invalid input
		} 	// works correctly
		
		if (valid_board_declare!=null)  // checks if the array is not null
		{
			int number_of_rows = valid_board_declare.length; // checks the number of rows of the double array
		    System.out.println("Number of rows are:" + number_of_rows);  // prints the number of rows of the double array
			
			int number_of_columns= valid_board_declare[0].length; // checks the number of columns of the double array
		    System.out.println("Number of columns are:" + number_of_columns);   // prints the number of columns of the double array
			
			if (((number_of_rows==6) && (number_of_columns==7)))    // checks if the number of rows and columns of the double array are valid, works correctly 		
		    {	
				// making a nested for loop to go through the entire board for valid characters and red & yellow tokens
				int r_count=0, y_count=0;
				
				for(int i=0;i<valid_board_declare.length;++i)   // loops through the number of rows present on the board
				{
					for(int j=0;j<valid_board_declare[i].length;++j)    // loops through the number of columns present on the board		
					{
						char c = valid_board_declare[i][j];  //loops throughout the entire board
						
						if(c=='R')  // checks if the board has a red token
						{
							r_count++; // increases total number of red tokens, test works
						}
						
						if (c=='Y')  // checks if the board has a yellow token
						{
							y_count++; // increases total number of yellow tokens, test works
						}
					
						if(valid_board_square(c)==false)   // to check for invalid characters
						{
							 System.out.println("Characters are invalid"); // test works
							return false;
						}	
					}					
				}   // end of nested for loop

				System.out.println("r_count: " + r_count);
				System.out.println("y_count: " + y_count);
						 
						if((r_count != y_count+1) && (r_count!=y_count))   // check that red greater than 1 or equal to yellow, test works
                            {
							 System.out.println("invalid number of red/yellow tokens");    
                             return false; // to be checked
                            }
						
						for(int a=0;a<=valid_board_declare.length-1;++a)  // loops through the number of rows
						{
							for(int b=0;b<valid_board_declare[a].length;++b)   // loops through the number of columns
							{
								char d = (char) valid_board_declare[a][b];   // goes through the entire board and checks all of the elements present in it.		
								char e = '\0' ;								

								if ((a>=0) && (a<valid_board_declare.length-1))  // test works
								{
									e = (char) valid_board_declare[a+1][b];								
								}
							System.out.print(d);   // prints the entire board
								
							if((d=='R') ||(d=='Y'))  // either a red or yellow token
								{		
									if(e=='.')  // checks if there is an empty space below a red or yellow token
									{
										System.out.println("Empty space found below...");
										return false; // incorrect position of the token
									}
								}  // test works
							}
							System.out.println(); // prints an empty line
						}  // end of nested for loop	
		    }
			
			else
			{
				System.out.println("Incorrect board size"); 
				return false; // incorrect board size  **check if required	, test works
			}
					}
		return true;
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
		
		boolean valid= valid_board(b1);  // checks if the board is valid or not
	    Q4_ValidMoves(b1);
		
		if(valid== true) // if the board is valid
		{
			System.out.println("Your input is valid"); // the code is correct and valid
		}
		
		else // if the board is invalid
		{
			System.out.println("Your input is not valid"); // the code is incorrect and/or invalid
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
		return res;
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
