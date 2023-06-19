import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numArr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int sumEvens = 0;
        int sumOdds = 0;

        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i] % 2 == 0){
                sumEvens += numArr[i];
            }else{
                sumOdds += numArr[i];
            }
        }
        System.out.println(sumEvens-sumOdds);
    }
}
