// Emmanuel Adeoye
public class NumbersAndFormatting {
    public static void main(String[] args) {
        int x = 7;
        int y = 3;
        double radius = 4.02;
        double pi = 3.14;
        double area = pi * radius * radius;
        
        System.out.println("x + y = " + (x + y));
        System.out.println("y + radius = " + (y + radius));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
        System.out.println("y % x = " + (y % x));
        System.out.printf("radius / x = %.2f", (radius / x));
        System.out.println();
        System.out.printf("The area of a circle with radius %.2f is %.2f", radius, area);
    }
}