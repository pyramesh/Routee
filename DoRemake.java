package Routee;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author Ramesh.Yaleru on 5/25/2021
 */
public class DoRemake {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("Cats are great pets","Tom got a small piece of pie.","He told us a very exciting tale");
        listString.forEach(s -> System.out.println("output => "+doRemake(s)));
    }
    static String doRemake(String str){
        System.out.println("input = > "+str);
        String punctuationChar = str.substring(str.length() - 1);
        boolean hasPunctuation = punctuationChar.equals(".") || punctuationChar.equals("!");
        String newStr = hasPunctuation ? str.substring(0, str.length() - 1): str;
        String s = Pattern.compile(" +").splitAsStream(newStr)
                .map(original -> isVowel(original) ? original+"way" : original.substring(1)+original.charAt(0)+"ay")
                .collect(Collectors.joining(" "));
        if(hasPunctuation)
            return  s.substring(0, 1).toUpperCase() + s.substring(1)+punctuationChar;
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
    static boolean isVowel(String original){
        return original.startsWith("a")||original.startsWith("e")||original.startsWith("i")||original.startsWith("o")||original.startsWith("u")||original.startsWith("A")||original.startsWith("E")||original.startsWith("I")||original.startsWith("O")||original.startsWith("U");
    }
}
