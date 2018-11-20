//Emmanuel Adeoye

//import java.lang.*;

public class QuadFunc {
    public static void main(String[] args) {
        double a = 1;
        double b = -4;
        double c = 4;
        
        
        
        printSol(posQuadF(a,b,c), negQuadF(a,b,c), 7);
        //System.out.printf("If the values of a, b, and c are (%d,%d,%d) the output would be (%)")
    }
    
    /* 
        input - 3 that are of type double
        
        solves the positive side of the quadratic equation
        
        returns a double that will be possibly be a solution
    */    
    public static double posQuadF(double a, double b, double c) {
        if((b*b)-(4*a*c) < 0.0) {
            return 0.0;
        } 
        double squared = Math.sqrt((b*b)-(4*a*c));
        if(a != 0){
            double quad = (-b + squared)/(2*a);
            return quad;   
        }
        else {
            return 0.0;
        }
    }
    
    /* 
        input - 3 that are of type double
        
        solves the negative side of the quadratic equation
        
        returns a double that will poaaibly be a solution
    */    
    public static double negQuadF(double a, double b, double c) {
        if((b*b)-(4*a*c) < 0.0) {
            return 0.0;
        } 
        double squared = Math.sqrt((b*b)-(4*a*c));
        if(a != 0){
            double quad = (-b - squared)/(2*a);
            return quad;   
        }
        else {
            return 0.0;
        }
    }
    
    public static void printSol(double pos, double neg, int dec) {
        if(pos == 0.0 && neg == 0.0) {
            System.out.println("This equation has no real solutions.");
        }
        else if((pos == 0.0 && neg != 0) || (pos == neg)) {
            System.out.printf("The equation has a solution of %." + dec + "f.",neg);
        }
        else if(pos != 0.0 && neg == 0) {
            System.out.printf("The equation has a solution of %." + dec + "f.",pos);
        }
        else {
            System.out.printf("The equation has the solutions of (%." + dec + "f, %." + dec + "f).", pos, neg);
        }
    }
}
