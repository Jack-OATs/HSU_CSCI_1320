import java.io.*;
import java.util.*;

public class StringIntro {
    public static void main(String[] args){
        String[] strArr = {"This", "That", "everything else"};
        System.out.println(Arrays.toString(strArr));
        for(int i = 0; i < strArr.length; i++) {
            for(int j = i+1; j < strArr.length; j++) {
                if(strArr[i].compareToIgnoreCase(strArr[j]) > 0) {
                    //swap two elements lexicographically
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }



        char one = '1'; //Stores both char and ASCII value
        char two = '2'; //Stores both char and ASCII value
        System.out.println(one + two);      // this prints 99 because ASCII of 1 = 49 while ASCII of 2 = 50;
        System.out.println(""+one + two);   //this prints 12 because of order of operations; string + int = string;

        if(one == two) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }


        String s = "Hello World!";
        System.out.println(s);
        for(int  i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

    }
}
