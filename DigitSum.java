package Routee;

/**
 * @author Ramesh.Yaleru on 5/25/2021
 */
public class DigitSum {
    public static void main(String[] args) {
        int input =785;//38 ;// 99892 ;//10;
        System.out.println(digitSum(input));
    }

    static int digitSum(int num){
        if (num == 0)
            return 0;
        return (num % 9 == 0) ? 9 : (num % 9);
    }
}
