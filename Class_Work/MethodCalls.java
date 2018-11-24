public class MethodCalls {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z = addTogether(x,y);
        printValue(z);
    }
    
    public static void printValue(int x) {
        System.out.println(x);
    }
    
    public static int addFive(int x) {
        return x + 5;
    }
    
    public static int addTogether(int x, int y) {
        return x + y;
    }
}