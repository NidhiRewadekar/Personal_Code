import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
  static String user_input;
  static int rounds;
  static String CPU_choice[];
  static String user_input_to_lower_case;
  static int user_points;
  static int opponent_points;
  
  public static void RPS()
  {
    Scanner sc=new Scanner (System.in);

    System.out.println("Please enter the number of rounds that you want to play this game for:");
    rounds=sc.nextInt();
    System.out.println();


    for(int i=1; i<=rounds; i++)
    {
    System.out.println();
      
    System.out.println("Round "+i);
    System.out.println("Please choose from the following: Rock, Paper, or Scissors");
    user_input=sc.next();
    System.out.println();

    user_input_to_lower_case=user_input.toLowerCase();

    if(!(user_input_to_lower_case.equals("rock")||(user_input_to_lower_case.equals("paper")||(user_input_to_lower_case.equals("scissors")))))
    {
      System.out.println("Please choose one of the options above and try again.");
      System.exit(0);
    }

      System.out.println();
      CPU_Choice();
      }
  }

  public static void CPU_Choice()
  {
    CPU_choice=new String[]{"Rock", "Paper", "Scissors"};

    int random_choice=new Random().nextInt(CPU_choice.length);
    String choice=CPU_choice[random_choice];

    System.out.println(choice);

    if(user_input_to_lower_case.equals("rock")&&(choice=="Rock"))
    {
      System.out.println("You have picked the same choice as your opponent, please try again.");
      System.out.println();
    }

    else if(user_input_to_lower_case.equals("rock")&&(choice=="Paper"))
    {
      System.out.println("Your opponent has won this round.");
      opponent_points++;
      System.out.println();
    }

    else if(user_input_to_lower_case.equals("rock")&&(choice=="Scissors"))
    {
      System.out.println("You have won this round! Congrats!");
      user_points++;
      System.out.println();
    }

    else if(user_input_to_lower_case.equals("paper")&&(choice=="Paper"))
    {
      System.out.println("You have picked the same choice as your opponent, please try again.");
      System.out.println();
    }

    else if(user_input_to_lower_case.equals("paper")&&(choice=="Rock"))
    {
      System.out.println("You have won this round! Congrats!");
      user_points++;
      System.out.println();
    }

    else if(user_input_to_lower_case.equals("paper")&&(choice=="Scissors"))
    {
      System.out.println("You opponent has won this round.");
      opponent_points++;
      System.out.println();
    }

    else if(user_input_to_lower_case.equals("scissors")&&(choice=="Scissors"))
    {
      System.out.println("You have picked the same choice as your opponent, please try again.");
      System.out.println();
    }

    else if(user_input_to_lower_case.equals("scissors")&&(choice=="Paper"))
    {
      System.out.println("You have won this round! Congrats!");
      user_points++;
      System.out.println();
    }

    else if(user_input_to_lower_case.equals("scissors")&&(choice=="Rock"))
    {
     System.out.println("Your opponent has won this round.");
      opponent_points++;
      System.out.println();
    }
  }

  public static void game_winner()
  {
    System.out.println("Your points:"+user_points);
    System.out.println("Your opponent's points:"+opponent_points);
    System.out.println();
    
      if(user_points>opponent_points)
      {
        System.out.println("You have won! Congrats and thanks for playing the game!");
        System.exit(0);
      }

      if(opponent_points>user_points)
      {
        System.out.println("Sorry, your opponent has won the game. Please try again.");
        System.exit(0);
      }

      if(user_points==opponent_points)
      {
         System.out.println("The game has ended in a tie, please try again.");
        System.exit(0);
      }
  }
  
  public static void main(String[] args) 
  {
    System.out.println("Welcome to the Rock Paper Scissors Game");
    System.out.println();
    RPS();
    game_winner();
  }
}
