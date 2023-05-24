import java.util.Scanner;

public class P5_Capitalise_First_Letter_Of_Each_Word 
{
	public static void Capitalise_First_Letter_Of_Each_Word()
	{
		Scanner scanner = new Scanner(System.in);
	     System.out.print("Input a Sentence: ");
		 String line = scanner.nextLine();
		 String changed_sentence = ""; 
	       Scanner lineScan = new Scanner(line); 
	         while(lineScan.hasNext()) {
	             String sentence = lineScan.next(); 
	             changed_sentence += Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1) + " "; 
	         }
	      System.out.println(changed_sentence.trim()); 
	}

	public static void main(String[] args) 
	{
		Capitalise_First_Letter_Of_Each_Word();
	}
}
