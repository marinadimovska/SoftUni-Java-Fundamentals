import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // a b c d e
        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length / 2 ; i++) {
            String oldElement = input[i];
            input[i] = input[input.length -1 - i];
            input[input.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", input));

    }
}
