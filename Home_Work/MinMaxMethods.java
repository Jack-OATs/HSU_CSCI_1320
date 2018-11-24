import java.util.Scanner;
import java.io.*;

public class MinMaxMethods {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileIn = new Scanner(new File("MinMax.txt"));
        
        int x = fileIn.nextInt();
        int y = fileIn.nextInt();
        int z = fileIn.nextInt();

        System.out.printf("For the set (%d, %d, %d) the maximum value is %d, and %d is the minimum value.", x,y,z,max(x,y,z),min(x,y,z));
       // System.out.println();
    }
    
    public static int max(int max, int b, int c) {
        if(b > max){
            max = b;
        }
        else if(c > max) {
            max = c;
        }
        return max;
    }

    public static int min(int min, int b, int c) {
        if(b < min){
            min = b;
        }
        else if(c < min) {
            min = c;
        }
        return min;
    }
}