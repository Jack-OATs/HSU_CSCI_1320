import java.io.*;
import java.util.*;

public class UpperCaseWords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("C:\\Users\\Emman\\IdeaProjects\\CSCI_1320\\Home Work\\Strings"));

        while(file.hasNextLine()) {
            System.out.println(toCaps(file.nextLine()));
        }
    }

    public static String toCaps(String str){
        String newStr = "";
        if (str.charAt(0) >= 65 && str.charAt(0) <= 90) {
            newStr += str.charAt(0);
        }
        else {
            newStr = "" + ((char) (str.charAt(0) - 32));
        }
        for(int i = 1; i < str.length() - 1; i++) {
            if(str.charAt(i) != ' ') {
                newStr += Character.toString(str.charAt(i));
            }
            else {
                if(str.charAt(i + 1) >= 65 && str.charAt(i + 1) <= 90) {
                    newStr += " " + Character.toString(str.charAt(i + 1));
                }
                else {
                    newStr += " " + Character.toString((char) (str.charAt(i + 1) - 32));
                }
                i++;
            }
        }
        newStr += Character.toString(str.charAt(str.length() - 1));
        return newStr;
    }
}
