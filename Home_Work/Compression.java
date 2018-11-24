import java.util.*;
import java.io.*;

public class Compression {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new File("Compression.txt"));
        while(file.hasNextInt()) {
            int x = file.nextInt();
            System.out.println(x + " compressed to " + CompressNum(x));   
        }
    }
    
    public static int CompressNum(int num) {
        //int newNum = 0;
        int sum = 0;
        
        if(num < 0){
            return -1;
        }
        else {
            do {
                while(num > 0) {
                    sum += num % 10;
                    num /= 10;   
                }
                num = sum;
                sum = 0;
            }while(num >= 10);
        }
        return num;
    }
}