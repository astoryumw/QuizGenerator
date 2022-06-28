import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class FileOpener {
    public String[][] dictionary() {
        System.out.println("I am in FileOpener");
        String[][] partsSplit = new String[595][2];;
        try {
            int i=0;
            File myFile = new File("vocabsecurity.txt");
            // System.out.println(myFile.getAbsolutePath());
            Scanner myScanner = new Scanner(myFile);
            // System.out.println(myScanner);
            // while still has another line, take first word as vocab and the rest as defintion
            while (myScanner.hasNextLine()) {
                // System.out.println("teehee");
                String[] parts = myScanner.nextLine().split("�");
                // System.out.println(Arrays.toString(parts));
                // for (int i=0; i<595; i++) {
                    partsSplit[i][0] = parts[0];
                    partsSplit[i][1] = parts[1];
                // }
                i++;
                // System.out.println(i);
                // System.out.println(Arrays.deepToString(partsSplit));
            }
            // System.out.println(Arrays.toString(partsSplit));

            myScanner.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            // aioobe.printStackTrace();
        }
        return partsSplit;
    }
}