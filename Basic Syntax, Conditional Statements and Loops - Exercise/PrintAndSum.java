import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while(firstNumber<=secondNumber){
            System.out.printf(firstNumber+ " ");
            sum += firstNumber;
            firstNumber++;
        }
        System.out.println();
        System.out.println("Sum: "+sum);
    }
}
