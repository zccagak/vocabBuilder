package vocabbuildergame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class vocabBuilderGame
{
  
    public static  playerInfo player = new playerInfo();
    public static  loginController logIn = new loginController();
      
    public static ArrayList<playerInfo> playerList = new ArrayList<playerInfo>();
     
    // newplayer = new playerInfo[player.getNumberOfPlayers()];
    
    public String userNameInput;
    public String passwordInput;
    public static boolean loggedIn;
    public static boolean isRegistered;
  
  public static void main(String[] args) throws IOException
    {
       playerInfo thePlayer = new playerInfo();
      
       Scanner scan = new Scanner(System.in);
       
        char selection = 'a';
        while (selection != 'q')
        {
            
          // main menu
            System.out.println();
            System.out.println("\tWelcome to the Word Game\n");
            System.out.println("\t\tLogin (L)");
            System.out.println("\t\tRegister (R)");
            System.out.println("\t\tAbout (A)");
            System.out.println("\t\tPlay the Game (P)");
            System.out.println("\t\tShow the Leaderboard (B)");
            System.out.println("\t\tQuit (Q)");
            System.out.println("\t\tTest (T)");
            System.out.print("\n\tPlease choose an option:_");
            selection = scan.next().charAt(0);
            switch (selection)
            {
                case 'l':
                case 'L':
                logIn.logIn();
                    break;
                case 'r':
                case 'R':
                logIn.register();
                    break;
                case 'a':
                case 'A':
                about();
                    break;
                case 'p':
                case 'P':
                theGame();
                    break;
                case 'b':
                case 'B':
                leaderBoard();
                    break;
                case 't':
                case 'T':
                Test();
                    break;
                

            }
        }
        System.out.println("\tPROGRAM ENDED\n");
    }  
  


  // this will end the program as we haven't writen any code for what the game does yet
  public static void about()
  {
    System.out.println("\t\n**Insert discription of game here when we have written code for it**\n");
  }
 
  // no code yet
  public static void theGame()
  {
    if (loggedIn == true)
    {
      System.out.println("\t\nYou may play the game");
      System.exit(0);
    }
    else 
    {
    	System.out.println("\t\nPlease Register first\n");
    }
  }
   
 // this will call informatio from the text file and create a leader board
  public static void leaderBoard()
  {
    System.out.println("\tPROGRAM ENDED\n");
    System.exit(0);
  }
  
  public static void Test()
  {
      System.out.println(player.getUserName() + "," + player.getPassword());
      if (isRegistered == true)
      {
          System.out.println("they are registered ");
      }
  }
  
}