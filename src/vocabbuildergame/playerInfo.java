package vocabbuildergame;



public class playerInfo 
{
  
  private  int numberOfPlayers = 20;  
    
  String userName;
  String password;

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public playerInfo() {
      
    }
    
    public playerInfo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "playerInfo{ userName=" + userName + ", password=" + password + '}';
    }

  
  
    
    
   
  
  


}



