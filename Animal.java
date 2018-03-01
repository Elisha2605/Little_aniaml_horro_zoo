import java.util.*;

public class Animal {
  
  // lav pseudorandom objekt
  Random r = new Random();
  Scanner console = new Scanner(System.in);
   
   
  private int x1;
  private int y1;
  private int x2;
  private int y2;  
  
    
  public void runGame() {
   int x1 = 1;
   int y1 = 1;
   int x2 = 9;
   int y2 = 9;
   int count = 0;
   while (! ((x1 == x2) && (y1 == y2))) {
      count++;
      if (r.nextBoolean() == true) {
      x1 = x1+1;
      }
      else {
      x1 = x1-1; 
      }   
      
      if (r.nextBoolean() == true) {
      x2 = x2+1;
      }
      else {
      x2 = x2-1;
      }            
      
      if (r.nextBoolean() == true) {
      y1 = y1+1;
      }
      else {
      y1 = y1-1;
      }
      
      if (r.nextBoolean() == true) {
      y2 = y2+1;
      }
      else {
      y2 = y2-1;
      }
      
      // begrænsning af første kvadrant
      if (x1 == 10) {
      x1 = 8;
      }
      if(x1 == 0) {
      x1 = 2;
      }
      if (x2 == 10) {
      x2 = 8;
      }
      if (x2 == 0) {
      x2 = 2;
      }
      if (y1 == 10) {
      y1 = 8;
      }  
      if (y1 == 0) {
      y1 = 2;
      }  
      if (y2 == 10) {
      y2 = 8;
      }
      if (y2 == 0) {
      y2 = 2;
      }   
      
            
      // står på samme felt
      if ((x1 == x2) && (y1 == y2)) {
         System.out.println("I am the Rabbit, and I am standing at (" + x1 + ", " + y1 + ")");
         System.out.println("I am the Snake, and I am standing at (" + x2 + ", " + y2 + ")");
         System.out.println("Rabbit: Arrgh! Mr. Snake, please do not eat me!");
         System.out.println("Snake: I am hungry, so I'm going to eat you!");  
      }
      else {
         System.out.println("I am the Rabbit, and I am standing at (" + x1 + ", " + y1 + ")");     
         System.out.println("I am the Snake, and I am standing at (" + x2 + ", " + y2 + ")");
      }  
   // står et ryk fra hinanden
      double a = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
      double b = Math.sqrt(a);
      double c = 2;
      
      if (b <= c) {
         System.out.println("Rabbit: Arrgh! Mr. Snake, please do not eat me!");
      }    
   }
   System.out.println();
   System.out.println("***********GAME OVER*************");
   System.out.println("The Rabbit was eaten by the Snake.");
   System.out.println("You survived for " + count + " rounds.");
  }
}