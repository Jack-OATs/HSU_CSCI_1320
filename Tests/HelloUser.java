import java.util.*;

public class HelloUser {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = kb.nextLine();

        if(name.equals("Wade Ashby")) {
            System.out.println("Hello Wade Ashby!");
            System.out.println("It is nice to see you professor");
        }
        else {
            System.out.println("Hello " + name + "!");
        }
    }
}
