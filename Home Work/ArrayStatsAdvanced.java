import java.io.*;
import java.util.*;

public class ArrayStatsAdvanced {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("C:\\Users\\Emman\\IdeaProjects\\CSCI_1320\\Home Work\\array.txt"));
        int[] lines = new int[1000];
        int cnt = 0;

        while(file.hasNextInt()) {
            lines[cnt] = file.nextInt();
            cnt++;
        }

        int[] info = new int[cnt];
        for(int i = 0; i < info.length; i++) {
            info[i] = lines[i];
        }

        int[] sorted = Sort(info);

//        System.out.println(Arrays.toString(sorted));
//        System.out.println(min(info));
//        System.out.println(max(info));
//        System.out.println(median(info));
//        System.out.println(mean(info));
//        System.out.println(mode(info));
        System.out.printf("min = %d \nmax = %d \nmean = %.1f \nmedian = %.1f \nmode = %d", min(sorted), max(sorted),
                mean(sorted), median(sorted), mode(sorted));
    }

    public static int[] Sort(int[] file) {
//        int[] newFile = new int[file.length];
//        if(file.length == 0) {
//            return file;
//        }
        int temp;
        for(int i = 0; i < file.length - 1; i++) {
            for(int j = 0; j < file.length - 1 - i; j++) {
                if (file[j] > file[j + 1]) {
                    temp = file[j];
                    file[j] = file[j + 1];
                    file[j + 1] = temp;
                }
            }
        }
        return file;
    }

    public static double mean(int[] file) {
        if(file.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i= 0; i < file.length; i++) {
            sum += file[i];
        }
        return sum/file.length;
    }

    public static int max(int[] file) {
        if(file.length != 0) {
            return file[file.length - 1];
        }
        return 0;
    }


    public static int min(int[] file) {
        if(file.length != 0) {
            return file[0];
        }
        return 0;
    }

    public static int mode(int[] file) {
        int cnt = 0;
        int mode = file[0];
        for(int i = 0; i < file.length - 1; i++) {
            int cnt1 = 1;
            for(int j = i+1; j < file.length; j++) {
                if(file[i] == file[j]) {
                    cnt1++;
                }
            }
            if(cnt1 > cnt) {
                mode = file[i];
                cnt = cnt1;
            }
        }
        return mode;
    }

    public static double median(int[] file) {
        int l = file.length;
        if(l % 2 != 0) {
            return file[(l / 2)];
        }
        else {
            return (file[(l / 2) - 1] + file[(l / 2)]) / 2.0;
        }
    }
}
