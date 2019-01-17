//Emmanuel Adeoye

import java.util.*;
import java.io.*;

public class MaxMin{
   public static void main(String[] args) throws FileNotFoundException{
      //This line allows reading a file called input.txt
      //Make sure you have input.txt in the same directory as the .java file
      Scanner fileIn = new Scanner(new File("C:\\Users\\Emman\\IdeaProjects\\CSCI_1320\\Home_Work\\MaxMin.txt"));
      
      int x = fileIn.nextInt();
      int y = fileIn.nextInt();
      int z = fileIn.nextInt();
      
      //This line is to show you the numbers if you wish to uncomment it out.
      //System.out.println("x = "+x+" y = "+y+" z = "+z);
      
      if((x > y || x == y) && (x > z || x == z)) {
         System.out.println("The max value is " + x);
      }
      else if((y > x || x == y) && (y > z || z == y)) {
         System.out.println("The max value is " + y);
      }
      else {
         System.out.println("The max value is " + z);
      }
      
      if((x < y || x == y) && (x < z || x == z)) {
         System.out.println("The min value is " + x);
      }
      else if((y < x || x == y) && (y < z || z == y)) {
         System.out.println("The min value is " + y);
      }
      else {
         System.out.println("The min value is " + z);
      }
      
      // if( x > y && x > z) {
      //    System.out.println("The max value is " + x);
      //    if(y < z) {
      //       System.out.println("The min value is " + y);
      //    }
      //    else {
      //       System.out.println("The min value is " + z);
      //    }
      // }
      // else if(y > x && y > z) {
      //    System.out.println("The max value is " + y);
      //    if( x < z) {
      //       System.out.println("The min value is " + x);
      //    }
      //    else {
      //       System.out.println("The min value is " + z);
      //    }
      // }
      // else {
      //    System.out.println("The max value is " + z);
      //    if (x < y) {
      //       System.out.println("The min value is " + x);
      //    }
      //    else {
      //       System.out.println("The min value is " + y);
      //    }
      // }
   } 
}