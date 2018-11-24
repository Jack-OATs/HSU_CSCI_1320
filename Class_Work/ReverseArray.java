import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] array2 = reverse(array);
        /*
        System.out.println((Arrays.toString(array)));
        System.out.println(Arrays.toString(array2));
        */

    }

    public static boolean equals(int[] arr, int[] arr2) {
        if(arr.length != arr2.length) {
            return false;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] reverse1(int[] array){
        int i = 0;
        int j = array.length - 1;
        while(i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }

    public static int[] reverse(int[] array) {
        int[] array2 = new int[array.length];
        for(int i = array.length-1; i >=0; i--) {
            array2[array.length - 1-i] = array[i];
        }
        return array2;
    }
}
