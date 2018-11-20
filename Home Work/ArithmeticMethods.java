public class ArithmeticMethods{

   public static void main(String[] args){
      int x = add(4,2);
      int y = subtract(4,2);
      int z = multiply(7,-7);
      int a = divide(32,-5);
      int b = mod(-14,5);
                                    //Expected output of each line
      System.out.println("x = "+x); //x = 6
      System.out.println("y = "+y); //y = 2
      System.out.println("z = "+z); //z = 12
      System.out.println("a = "+a); //a = 2
      System.out.println("b = "+b); //b = 2
      System.out.println(-14%5);
   }
   
   public static int add(int a, int b){
      return a+b;
   }
   
   public static int subtract(int a, int b){
      return add(a,-b);
   }
   
   public static int multiply(int a, int b){
      //int count = 0;
      int x = 0;
      boolean isNeg = isNeg(a,b);
      
      a = abs(a);
      b = abs(b);
      
      while(b > 0) {
         x = add(x,a);
         b = subtract(b,1);
      }
      
      if(isNeg) {
         return -x;
      }
      return x;
   }
   
   public static int divide(int a, int b){
      int count = 0;
      boolean isNeg = isNeg(a,b);
      
      a = abs(a);
      b = abs(b);
      
      while(a >= b) {
         a = subtract(a,b);
         count = add(count,1);
      }
      if(isNeg) {
         return -count;
      }
      return count;
   }
   
   public static int mod(int a, int b){
      boolean isNeg;
      if((a < 0 && b < 0) || (b < 0)){
         isNeg = !(isNeg(a,b));
      }
      else {
         isNeg = (isNeg(a,b));
      }
      
      a = abs(a);
      b = abs(b);
      
      while(a >= b) {
         a = subtract(a,b);
      }
      
      if(isNeg) {
         return -a;
      }
      return a;
   }
   
   public static int abs(int x){
      if(x < 0){
         return -x;
      }
      return x;
   }
   
   public static boolean isNeg(int a, int b){
      boolean isNeg = false;
      if ((a < 0) != (b < 0)) {
         return isNeg = true;
      }
      return isNeg = false;
   }
}