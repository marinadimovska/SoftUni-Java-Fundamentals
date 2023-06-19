import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i] % 2 == 0){
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }

}
