package vocabbuildergame;

import java.util.ArrayList;
import java.util.Scanner;

public class vocabBuilderGame
{
  
    public static  playerInfo player = new playerInfo();
  
  
      
    public static ArrayList<playerInfo> playerList = new ArrayList<playerInfo>();
     
     // newplayer = new playerInfo[player.getNumberOfPlayers()];
    
    public String userNameInput;
    public String passwordInput;
		public static boolean loggedIn;
  	public static boolean isRegistered;
  
  public static void main(String[] args)
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
            System.out.print("\n\tPlease choose an option:_");
            selection = scan.next().charAt(0);
            switch (selection)
            {
                case 'l':
                case 'L':
                logIn();
                    break;
                case 'r':
                case 'R':
                register();
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
                

            }
        }
        System.out.println("\tPROGRAM ENDED\n");
    }  
  
public static void register() 
  {
      
      
  Scanner scan = new Scanner(System.in);
  
        System.out.print("\n\tEnter a username ");
        player.setUserName(scan.next());
        
        
       
        System.out.print("\n\tEnter a password ");
        player.setPassword(scan.next());
        
        
        
        
     
        
        
     isRegistered = false;
    
    while(isRegistered==false){
        
        if(player.getPassword().length() <5 || player.getPassword().length() >15){
            System.out.println("\n please enter a password between 5 and 15 characters ");
            register();
            
        }
    
        else{
             playerInfo players = new playerInfo(player.getUserName(),player.getPassword());
             playerList.add(players);
            System.out.println("\t \nyou have registered");
            isRegistered = true;
        }
    }
        
/*    }
        while (password.length() < 5 || password.length() > 15)
      {
        System.out.println("\n\tYour password needs to be between 5 and 15 characters.");
        System.out.println("\n\tPlease enter a new password: ");
        player.setPassword(scan.nextLine());
      }
*/  
  

      System.out.println(playerList);

  }



  public static void logIn() 
  { 
      String userNameCheck = "";
      String passwordCheck = "";
    
    	Scanner scan = new Scanner(System.in);  
      
    if (isRegistered == true)
     {
         
        System.out.print("\n\tEnter your username ");
        userNameCheck = scan.next();
            
        
        
        
        System.out.print("\n\tEnter your password ");
        passwordCheck = scan.next();
      
     }
        
      // cant use == here as this checks if theyre from the same memory address - which they would never be so the prog. would always run else
      for (playerInfo info : playerList) {
          if(info.userName.contains(userNameCheck) && info.password.contains(passwordCheck)){
              System.out.println("\n\tYou are logged in\n");
             
                    loggedIn = true;
                     
          }
      
            
   
      
          else if(loggedIn ==false){
              System.out.println("Username or password incorrect");
          }
      
       
      
         
      }
                     
                     
     
      
  }
  
  
  // this will end the program as we haven't writen any code for what the game does yet
  public static void about()
  {
    System.out.println("\t\n**Insert discription of game here when we have written code for it**\n");
  }
 
  // no code yet
  public static void theGame(){
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
  public static void leaderBoard(){
    System.out.println("\tPROGRAM ENDED\n");
    System.exit(0);
  }
  
}