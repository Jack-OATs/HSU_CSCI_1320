import java.io.*;
import java.util.*;

public class UpperCaseWords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("C:\\Users\\Emman\\IdeaProjects\\CSCI_1320\\Home_Work\\Strings"));

        while(file.hasNextLine()) {
            System.out.println(toCaps(file.nextLine()));
        }
    }

    public static String toCaps(String str){
        if(str.length() == 0) {
            return str;
        }
        String newStr = "";
        if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
            newStr = "" + ((char) (str.charAt(0) - 32));
        }
        else {
            newStr += str.charAt(0);
        }
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i - 1) == ' ' && (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                newStr += Character.toString((char) (str.charAt(i) - 32));
            }
            else {
                newStr += Character.toString(str.charAt(i));
            }
        }
        return newStr;
    }
}