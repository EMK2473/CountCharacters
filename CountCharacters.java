package CountCharacters;

import java.util.Scanner;

public class CountCharacters {
   public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    
    String character = scnr.next();
    String string = scnr.next();
    
    System.out.println("Character: " + character);
    System.out.println("String: " + string);
    scnr.close();
   }
}
