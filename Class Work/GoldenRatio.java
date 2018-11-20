public class GoldenRatio {
    public static void main(String[] args) {
        //System.out.println(Fib(78));
        double threshold = 0.001;
        double current = 1.0*fib(1)/fib(0);
        double previous;
        int counter = 2;
        do {
            previous = current;
            current = 1.0*fib(counter)/fib(counter - 1);
            counter++;
        }while(Math.abs(current - previous) > threshold);
        System.out.printf("Golden Ratio = %.10f\n", current);
        System.out.println("It took " + counter + " iterations.");
    }
    
    public static int fib(int n){
        int a = 1;
        int b = 1;
        int step = 0;
        while(step < n) {
            int temp = a + b;
            a = b;
            b = temp;
            step++;
        }
        return b;
    }
}