import java.util.*;
import java.io.*;

public class TranslatedCodeMessage {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner fIn = new Scanner(new File("C:\\Users\\Emman\\IdeaProjects\\CSCI_1320\\Tests\\input")); //reads in the text from input.txt

        String[] pWords = new String[100];  //create two Str arrays with 1000 elements
        String[] cWords = new String[100];

        boolean isFLine = true; //create a boolean variable called isFLine. checks for the first line in fIn
        String message = "";  //will be set to the first line in fIn

        int cnt = 0;    //create cnt variable to check how many elements are actually needed out of the 1000
        while(fIn.hasNextLine()) {  //check to see if fIn has something to read in
            if(isFLine) {
                isFLine = false;    //set isFLine to false so this if statement no longer runs
                message = fIn.nextLine();   //set message to to first line in fIn
            }
            cWords[cnt] = fIn.next();   //set the next string to cWords[cnt]
            pWords[cnt] = fIn.next();   //set the next string to pWords[cnt]
            cnt++;
        }

        String[] pWordArr = new String[cnt];    //Now create two Str arrays with only the necessary amount of variables
        String[] cWordArr = new String[cnt];
        for(int i = 0; i < cnt; i++) {
            pWordArr[i] = pWords[i];    //now set each pWords[i] (old array) to pWordArr[i] (new array)
            cWordArr[i] = cWords[i];    //now set each cWords[i] (old array) to cWordArr[i] (new array)
        }


        String[] words = message.split("\\s+"); // splits by whitespace
        String trueMessage = "";       //trueMessage will contain the decoded message
        for (String word : words) {     //iterate through the Str array (words)
            for(int i = 0; i < cWordArr.length; i++) {  //iterate through cWordArr since that is the array that is being checked against
                if(word.equals(cWordArr[i])) {      //check if (word) is the same as what is in cWordArr[i]
                    trueMessage += pWordArr[i] + " ";   //if so, add what is in pWordArr[i] to trueMessage plus a space
                }
            }
        }

        System.out.println(trueMessage);    //print out trueMessage




    }
}
