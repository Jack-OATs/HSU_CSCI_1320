import java.util.*;
import java.io.*;

public class ArrayStatsBasic {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("C:\\Users\\Emman\\IdeaProjects\\CSCI_1320\\Home Work\\array.txt"));
        double[] lines = new double[10];
        int cnt = 0;

        while(file.hasNextDouble()) {
            lines[cnt] = file.nextDouble();
            cnt++;
        }

        double[] info = new double[cnt];
        for(int i = 0; i < info.length; i++) {
            info[i] = lines[i];
        }

        //System.out.println(Arrays.toString(info));
        System.out.printf("min = %.2f \nmax = %.2f \nmean = %.2f", min(info), max(info), mean(info));
    }

    public static double max(double[] file) {
        if(file.length == 0) {
            return 0;
        }
        double max = file[0];
        for(int i = 1; i < file.length; i++) {
            if(file[i] > max) {
                max = file[i];
            }
        }
        return max * 1.0;
    }

    public static double min(double[] file) {
        if(file.length == 0) {
            return 0;
        }
        double min = file[0];
        for(int i = 1; i < file.length; i++) {
            if(file[i] < min) {
                min = file[i];
            }
        }
        return min * 1.0;
    }

    public static double mean(double[] file) {
        if(file.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i= 0; i < file.length; i++) {
            sum += file[i];
        }
        return sum/file.length;
    }
}
