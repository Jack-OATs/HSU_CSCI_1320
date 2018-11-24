import java.util.*;
import java.io.*;

public class SortingMethods{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new File("C:\\Users\\Emman\\IdeaProjects\\CSCI_1320\\Home Work\\array.txt"));
        double[] lines = new double[1000];
        int cnt = 0;

        while(file.hasNextDouble()) {
            lines[cnt] = file.nextDouble();
            cnt++;
        }

        double[] info = new double[cnt];
        for(int i = 0; i < info.length; i++) {
            info[i] = lines[i];
        }

        info = bubbleSort(info);
        System.out.println(Arrays.toString(info));

        info = bubbleSort2(info);
        System.out.println(Arrays.toString(info));
    }

    public static double[] bubbleSort(double[] file) {
        for(int i = 0; i < file.length - 1; i++) {
            for(int j = 0; j < file.length - 1 - i; j++) {
                if (file[j] > file[j + 1]) {
                    double temp = file[j];
                    file[j] = file[j + 1];
                    file[j + 1] = temp;
                }
            }
        }
        return file;
    }

    public static double[] bubbleSort2(double[] file) {
        for(int i = 0; i < file.length - 1; i++) {
            for(int j = i+1; j < file.length; j++) {
                if (file[j] < file[i]) {
                    double temp = file[j];
                    file[j] = file[i];
                    file[i] = temp;
                }
            }
        }
        return file;
    }
}
