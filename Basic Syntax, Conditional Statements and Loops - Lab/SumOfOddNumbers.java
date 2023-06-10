import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner scan = new Scanner(System.in);
        int oddNumbersCount = Integer.parseInt(scan.nextLine());
        int sumOfOddNumbers = 0;
        int currentNum = 1;
        for (int i = oddNumbersCount; i > 0; i--)
        {
            sumOfOddNumbers += currentNum;
            System.out.println(currentNum);
            currentNum += 2;
        }

        System.out.println("Sum: " + sumOfOddNumbers);
    }
}
