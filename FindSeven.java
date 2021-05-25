package Routee;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Ramesh.Yaleru on 5/22/2021
 */
public class FindSeven {
    public static void main(String[] args) {
        //int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        //int[] input = new int[]{8, 6, 33, 100};
        int[] input = new int[]{2, 55, 60, 97, 86};
        System.out.println(findSeven(input,'7'));
    }
    static String findSeven(int[] intArray, char toFind){
        String[] strArray = Arrays.stream(intArray)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        return Stream.of(strArray).anyMatch(n -> n.contains(String.valueOf(toFind))) ? "Found": "there is no 7 in the array";

    }
}
