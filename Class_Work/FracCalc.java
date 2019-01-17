public class FracCalc {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(2);
        Fraction f3 = f1.multiply(f2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}

class Fraction {
    public int numer = 0;
    public int denom = 0;

    public Fraction(int n, int d) {
        numer = n;
        denom = d;
    }

    public Fraction(int n) {
        numer = n;
        denom = 1;
    }

    public Fraction multiply(Fraction f) {
        int n = this.numer * f.numer;
        int d = this.denom *f.denom;
        return new Fraction(n,d);
    }

    public String toString() {
        return numer + "/" + denom;
    }
}