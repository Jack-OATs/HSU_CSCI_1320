import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num;
        
        do{
            System.out.print("Please input a positive number: ");
            num = kb.nextInt();
        }
        while(num <= 0);
    }
}