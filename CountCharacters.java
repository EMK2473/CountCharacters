package CountCharacters;

import java.util.Scanner;

public class CountCharacters {
   public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    
    char character = scnr.next().charAt(0);
    String string = scnr.next();
    int count = 0;
    
    System.out.println("Character: " + character);
    System.out.println("String: " + string);

    for (int i = 0; i < string.length(); ++i) {
      if(string.charAt(i) == character){
         count++;
      }
    }
    System.out.println(count + " " + character + "'s");
    scnr.close();
   }
}
