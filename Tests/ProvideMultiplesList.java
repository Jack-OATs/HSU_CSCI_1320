import java.util.*;

public class ProvideMultiplesList {
    public static void main(String[] args) {
        Scanner kbIn = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = kbIn.nextInt();

        while(num < 0) {
            System.out.print("Enter a positive integer: ");
            num = kbIn.nextInt();
        }

        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                int div = num / i;
                if(i <= div) {
                    System.out.println(i + "x" + div);
                }
            }
        }
    }
}
