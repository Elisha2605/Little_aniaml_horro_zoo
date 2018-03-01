import java.util.*;

public class Game {
   public static void main(String [] args) {
   
   // lav dyr
   Animal animal = new Animal();
   
  // console input
   Scanner console = new Scanner(System.in);
   
   System.out.println("Welcome to the game \"Bunny Hop\".");
   System.out.println("Let us see how many turns you are able to stay away and not be eaten by the snake.");  
   System.out.println("Type \'start\' to start the game.");
   while (!console.hasNext("start")) {
      System.out.println("You have made a typo. Try again.");
      console.next(); 
   }
   
   animal.runGame();
   }
}