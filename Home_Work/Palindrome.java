import java.util.*;
import java.io.*;

public class Palindrome {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fin = new Scanner(new File("input.txt"));

        while(fin.hasNextLine()) {
            if(isPalindrome(fin.nextLine())) {
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
    }

    public static boolean isPalindrome(String phrase){        //code was received from https://stackoverflow.com/questions/4138827/check-string-for-palindrome
        phrase = oneLine(phrase);
        int cnt = 0;
        int cnt2 = phrase.length() - 1;
        while(cnt2 > cnt) {
            if(phrase.charAt(cnt) != phrase.charAt(cnt2)) {
                return false;
            }
            cnt++;
            cnt2--;
        }
        return true;
    }

    public static String oneLine(String phrase){
        phrase = phrase.toLowerCase();
        char[] letters = {'e', 'a', 'r', 'i', 'o', 't', 'n', 's', 'l', 'c', 'u', 'd', 'p', 'm', 'h', 'g', 'b', 'f', 'y', 'w', 'k', 'v',
                'x', 'z', 'j', 'q', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String phrase2 = "";
        int cnt = 0;
        while(cnt < phrase.length()) {
            for (char letter : letters) {
                if (phrase.charAt(cnt) == letter) {
                    phrase2 += phrase.charAt(cnt);
                    break;
                }
            }
            cnt++;
        }
        return phrase2;
    }
}
