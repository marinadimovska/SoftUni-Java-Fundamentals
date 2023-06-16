import java.util.Scanner;

public class SumofChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        // за всеки символ от 1 до последния
        //1. прочитам
        //2. сумирам аски кода
        int sum = 0; //ascii codes sum
        for (int i = 0; i <n ; i++) {
            char symbol = scanner.nextLine().charAt(0);//така взимаме символ от конзолата
            int asciiCode = (int) symbol;
            sum += asciiCode;
        }
        System.out.println("The sum equals: "+sum);
    }
}
