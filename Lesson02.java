package codewars;

import java.util.Arrays;

public class Lesson02 {
    public static void main(String[] args) {

        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }

    public static String toJadenCase(String phrase) {
        if(phrase.isEmpty())
            return null;

        String[] arr = phrase.split(" ");
        String outString = "";
        for(String s : arr){
            outString += capitalize(s) + " ";
        }

        return outString.substring(0, outString.length() - 1);
    }
    public static String capitalize(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
