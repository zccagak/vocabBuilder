package vocabbuildergame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class loginController 
{
    public static Boolean isRegistered= false;
    public static Boolean loggedIn =false;
    
     public static ArrayList<playerInfo> playerList = new ArrayList<playerInfo>();
    
    
    public static void logIn() 
  { 
      String userNameCheck = "";
      String passwordCheck = "";
    
    	Scanner scan = new Scanner(System.in);  
      
        if (isRegistered == true)
        {
         
            System.out.print("\n\tEnter your username: ");
            userNameCheck = scan.next();
            System.out.print("\n\tEnter your password: ");
            passwordCheck = scan.next();
        }
        else 
        {
            System.out.println("\nPlease Register First ");
        }
        
        for (playerInfo info : playerList) 
        {
            if(info.userName.contains(userNameCheck) && info.password.contains(passwordCheck))
            {
                System.out.println("\tYou are logged in\n");
                loggedIn = true;    
                break;
            }
            else if(loggedIn ==false)
            {
                System.out.println("Username or password incorrect");
            }
        }
       
  } 

public static void register() 
    {
        playerInfo player = new playerInfo();
    
        Scanner scan = new Scanner(System.in);
  
        System.out.print("\n\tEnter a username ");
        player.setUserName(scan.next());
        
        System.out.print("\n\tEnter a password ");
        player.setPassword(scan.next());
        isRegistered = false;
    
        while(isRegistered==false)
        {
            if(player.getPassword().length() <5 || player.getPassword().length() >15)
        {
            System.out.println("\n please enter a password between 5 and 15 characters ");
            register();   
        }
        else
        {
            playerInfo players = new playerInfo(player.getUserName(),player.getPassword());
            playerList.add(players);
            try 
            {
                writer();
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(vocabBuilderGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\t \nyou have registered");
                isRegistered = true;
        }
        }
    }
   
public static void writer() throws FileNotFoundException, IOException 
    { 
        
        File file = new File("/Users/georgekidd/Desktop/vocabBuilder/src/vocabbuildergame/playerInfo.txt");
        FileOutputStream fo = new FileOutputStream(file,true);
        PrintWriter pw = new PrintWriter(fo);

        for (playerInfo elem : playerList)
        {
            pw.println(elem);
        }
             pw.close();
             fo.close();
  
    }


}