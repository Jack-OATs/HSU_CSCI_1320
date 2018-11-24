// Emmanuel Adeoye
import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your favorite positive number: ");
        int favNum = input.nextInt();

        double favNum2 = favNum;
        System.out.println();
        System.out.println("Your favorite number is " + favNum);
        System.out.println("Your favorite number doubled is " + 2*favNum);
        System.out.println("Your favorite number squared is " + favNum*favNum);
        System.out.println("Your favorite number in negative form is " + (-favNum));
        System.out.printf("Your favorite number in its inverse form is  %.3f", (1/favNum2));
    }
}