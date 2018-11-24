import java.util.Scanner;

public class MinCoin_Ashby {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter a change amount: ");
        int change = kb.nextInt();
        int q = change / 25;
        change = change % 25;
        int d = change / 10;
        change = change % 10;
        int n = change / 5;
        int p = change % 5;
        
        if(q != 0) {System.out.println(q +" quarters"); }
        if(d != 0) {System.out.println(d +" dimes"); }
        if(n != 0) {System.out.println(n +" nickels"); }
        if(p != 0) {System.out.println(p +" pennies"); }
    }
}