public class Player {
  
  private String surname;
  private char position;
  private int number;
  
  public Player(String s, char p, int n) 
  { 
    surname = s;
    position = p;
    number = n;
  }
 
  public void setSurname(String s){surname = s;}
  public void setPosition(char p){position = p;}
  public void setNumber(int n){number = n;}
  
  public String getSurname(){return surname;}
  public char getPosition(){return position;}
  public int getNumber(){return number;}
  
  public String toString()
  {
    return surname + ", Number " + number + ", Position: " + position; 
    
  }
  
}