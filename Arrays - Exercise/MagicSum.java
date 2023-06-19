import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //входни данни:
        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());
        //1 7 6 2 19 23  1 7
        //8              6 2
        for (int index = 0; index < numbers.length ; index++) {
            int curNum = numbers[index];
            for (int secondIndex = index+1; secondIndex <numbers.length ; secondIndex++) {
                int numToSum = numbers[secondIndex];
                if(curNum + numToSum == magicSum){
                    System.out.println(curNum + " "+ numToSum);
                }
            }
        }
    }
}
