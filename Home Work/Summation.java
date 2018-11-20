//Emmanuel Adeoye
import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x = 0;
        int sum = 0;
        //String str = "";
        int num;
        
        do {
            System.out.print("Make sure your number is a positive number: ");
            num = kb.nextInt();
        }
        while(num <= 0);
        
        // while (num <= 0) {
        //     System.out.print("Make sure your number is a positive number: ");
        //     num = kb.nextInt();
        // }
        
        while(x <= num) {
            sum += x;
            x++;
            if (x == num) {
                System.out.print(x + "=" + (sum+x));
            }
            else if(x < num) {
                System.out.print(x + "+");
            }
        }
        
        //System.out.println(str + sum);
    }
}