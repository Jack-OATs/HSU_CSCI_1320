import java.util.*;

public class Arrays2DIntro {
    public static void main(String[] args) {
        int[][] arr2d = new int[5][5];
        //System.out.println(Arrays.toString(arr2d));
        print2Darray(arr2d);
        System.out.println("---------------");
        arr2d = fillWithMultChart(arr2d);
        print2Darray(arr2d);
    }

    public static int[][] fillWithMultChart(int[][] a) {
        for(int r = 0; r < a.length; r++) {
            for(int c = 0; c < a[r].length; c++) {
                a[r][c] = (r*1) * (c+1);
            }
        }
        return a;
    }

    public static void print2Darray(int[][] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
