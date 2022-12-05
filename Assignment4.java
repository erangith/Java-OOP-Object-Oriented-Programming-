//Name=dadayakkara dewege poorna


import java.util.Random;
import java.util.ArrayList;

public class Assignment4
{
  public static void main(String[] args)
  {
    Random gen = new Random();
    ArrayList<String> names = new ArrayList<String>(); // {"Bure", "Erat", "Adams", "Gaudreau", "Davidsson"};
    ArrayList<Integer> numbers = new ArrayList<Integer>(); // {11, 18, 14, 6, 24};
    char[] positions = { 'G', 'D', 'F' };
    
    names.add("Bure");
    names.add("Erat");
    names.add("Adams");
    names.add("Gaudreau");
    names.add("Davidsson");
    
    numbers.add(11);
    numbers.add(18);
    numbers.add(14);
    numbers.add(6);
    numbers.add(24);
    
    int length = names.size();
    
    ArrayList<Player> players = new ArrayList<Player>();
    // create players
    for (int i = 0; i < length; i++)
    { 
      players.add(new Player(names.remove(gen.nextInt(numbers.size())), positions[gen.nextInt(3)], numbers.remove(gen.nextInt(numbers.size()))));
    }
    
    // print players
    for(Player p: players) {
      System.out.println(p);
    }
    
   // print all numbers higher than 11
    System.out.println("\nRemoving players who have a number larger than 11:");
    ArrayList<Player> playersToRemove = new ArrayList<Player>();
    for(int i = 0; i < players.size(); i++)
    {
      if(players.get(i).getNumber() > 11)
      {
        playersToRemove.add(players.get(i)); // building a list of players who have numbers greater than 11
      }
    }

    for(Player p: playersToRemove){
      players.remove(p); // removing the players from the list that are have numbers greater than 11
    }
    
    
    for(Player p: players)
    {
      System.out.println(p);
    }
    
     // remove the last name according the alphabet
     System.out.println("\nRemoving the last name alphabetically:");
     
     if(players.get(0).getSurname().compareTo(players.get(1).getSurname()) < 0)
     {
       System.out.println(players.get(0));
     }
     else
     {
       System.out.println(players.get(1));
     }
     
      
  }
}

