package annagram;

import java.util.Arrays;
import java.util.Scanner;

public class Annagram {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input string using space for spliting words: ");
        String firstStr = in.nextLine();

        Scanner inSecond = new Scanner(System.in);
        System.out.println("Input Second string using space for spliting words: ");
        String secondStr = in.nextLine();

        if (isAnnagramStrings(firstStr, secondStr)){
            System.out.println("This is ANNAGRAM");
        } else {
            System.out.println("This is NOT ANNAGRAM");
        }
    }

    public static boolean isAnnagramStrings (String firstStr, String secondStr) {
        if (firstStr.length() != secondStr.length() ) {
            return false;
        }

        firstStr = firstStr.toLowerCase();
        secondStr = secondStr.toLowerCase();

        char[] firstCharArr = firstStr.replaceAll(" ","").toCharArray();
        char[] secondCharArr = secondStr.replaceAll(" ","").toCharArray();

        Arrays.sort(firstCharArr);
        Arrays.sort(secondCharArr);

        if (Arrays.equals(firstCharArr, secondCharArr)) {
            return true;
        }

        return false;
    }
}

