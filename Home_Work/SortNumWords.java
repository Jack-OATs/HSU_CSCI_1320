import java.util.*;
import java.io.*;

public class SortNumWords {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner fin = new Scanner(new File("C:\\Users\\Emman\\IdeaProjects\\CSCI_1320\\Home_Work\\numWords"));
        int[] num = new int[100];
        String[] str = new String[100];
        int cnt = 0;

        while(fin.hasNextInt()) {
            num[cnt] = fin.nextInt();
            str[cnt] = fin.nextLine();
            cnt++;
        }

        int[] numArr = new int[cnt];
        String[] strArr = new String[cnt];
        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = num[i];
            strArr[i] = str[i];
        }

        String[] sortedNum = sortNum(numArr, strArr);
        String[] sortedStr = sortStr(strArr, numArr);

        for(int i = 0; i < numArr.length; i++) {
            System.out.println(sortedNum[i]);
        }

        System.out.println();

        for(int i = 0; i < numArr.length; i++) {
            System.out.println(sortedStr[i]);
        }
    }

    public static String[] sortNum(int[] num, String[] str) {
        String[] arr = new String[num.length];
        for(int i = 0; i < num.length - 1; i++) {
            for(int j = i+1; j < num.length; j++) {
                if (num[j] < num[i]) {
                    int temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;

                    String temp1 = str[j];
                    str[j] = str[i];
                    str[i] = temp1;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = "" + num[i] + " " + str[i];
        }

        return arr;
    }

    public static String[] sortStr(String[] str, int[] num) {
        String[] arr = new String[str.length];

        for(int i = 0; i < str.length; i++) {
            for(int j = i+1; j < str.length; j++) {
                if(str[i].compareToIgnoreCase(str[j]) > 0) {
                    //swap two elements lexicographically
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;

                    int temp1 = num[i];
                    num[i] = num[j];
                    num[j] = temp1;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = "" + num[i] + " " + str[i];
        }

        return arr;
    }
}
