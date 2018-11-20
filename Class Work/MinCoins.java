import java.util.Scanner;

public class MinCoins {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int coins = kb.nextInt();
        
        int rcoins = coins - (quarters(coins) * 25);
        System.out.println("You need " + quarters(coins) + " " + qAmount(quarters(coins)) +".");
        
        int rcoins2 = rcoins - (dimes(rcoins) * 10);
        System.out.println("You need " + dimes(rcoins) + " " + dAmount(dimes(rcoins)) +".");
        
        int rcoins3 = rcoins2 - (nickels(rcoins2) * 5);
        System.out.println("You need " + nickels(rcoins2) + " " + nAmount(nickels(rcoins2)) +".");
        
        System.out.println("You need " + rcoins3 + " " + pAmount(rcoins3) +".");

    }
    
    public static int quarters(int x){
        int q =  x / 25;
        return q;
    }
    
    public static String qAmount(int x) {
        if(x > 1) {
            return ("quarters");
        }
        return ("quarter");
    }
    
    
    public static int dimes(int x){
        int d = x / 10;
        return d;
    }
    
    public static String dAmount(int x) {
        if(x > 1) {
            return ("dimes");
        }
        return ("dime");
    }
    
    public static int nickels(int x){
        int n =  x / 5;
        return n;
    }
    
    public static String nAmount(int x) {
        if(x > 1) {
            return ("nickels");
        }
        return ("nickel");
    }
    
    public static String pAmount(int x) {
        if(x > 1) {
            return ("pennies");
        }
        return ("penny");
    }
    
    // public static int pennies(int x){
    //     return x / 25;
    // }
}