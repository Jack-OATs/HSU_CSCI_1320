public class forLoopIntro {
    public static void main(String[] args) {
        // int x = 100;
        // for(x = 0; x < 10; x++) {
        //     System.out.println(x);
        // }
        // System.out.println(x);
        printFactorial(12);
    }
    
    public static void printFactorial(int n){
        int total = 1;
        for(int i = n; i > 1; i--) {
            System.out.print(i + " x ");
            total *= i;
        }
        
        System.out.println("1 = " + total);
    }
}