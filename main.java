import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        // System.out.println("An application to quiz yourself. Press q to quit.");
        FileOpener fo = new FileOpener();
        String[][] myList = fo.dictionary();
        // System.out.println(Arrays.deepToString(myList));

        // randomly find a certain set, then grab three vocab words
        Random rand = new Random();
        int number = rand.nextInt(0,myList.length);
        String[] words = new String[4];
        // System.out.println(number);
        // System.out.println(Arrays.toString(myList[number]));
        String[] answer = myList[number];
        words[0] = myList[number][0];
        System.out.println(answer[1]);
        for (int i=1; i<4; i++) {
            number = rand.nextInt(0,myList.length);
            words[i] = myList[number][0];
        } // TODO; make it where it cant grab a number that has already been selected
        
        // shuffle words
        List<String> myOtherList = Arrays.asList(words);
        Collections.shuffle(myOtherList);
        myOtherList.toArray(words);
        
        System.out.println(Arrays.toString(words));

        Scanner myScanner = new Scanner(System.in);
        String enteredAnswer = myScanner.nextLine();
        // System.out.println(enteredAnswer);
        // System.out.println(answer[0]);
        // List valid = Arrays.asList(answer[0]);
        // System.out.println(valid);
        // if (valid.contains(enteredAnswer)) {
        //     System.out.println("You got it right!");
        // } else {
        //     System.out.println("You got it wrong.");
        // }

        // not working, maybe just split the string and check each element
        String[] newAnswer = answer[0].split(" ");
        // System.out.println(Arrays.toString(newAnswer));
        String[] newEnteredAnswer = enteredAnswer.split(" ");
        // System.out.println(Arrays.toString(newEnteredAnswer));
        if (Arrays.equals(newAnswer,newEnteredAnswer)) {
            System.out.println("You got it right!");
        } else {
            System.out.println("You got it wrong.");
        }

        
        

    }
}