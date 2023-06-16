import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //взимаме последната цифра
        //сумираме
        //премахваме я

        int num = Integer.parseInt(scanner.nextLine());
        int lastDig = 0;
        int sum = 0;
        while (num>0){
            lastDig = num % 10;
            sum += lastDig;
            num = num /10;
        }
        System.out.println(sum);
    }
}
