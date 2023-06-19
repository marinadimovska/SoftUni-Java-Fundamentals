import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //прочитаме входните данни
        int[] number = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            if (input.contains("swap")) {//"swap {2} {4}"
                String[] command = input.split(" ");
                int index1 = Integer.parseInt(command[1]);
                int index2 = Integer.parseInt(command[2]);

                int firstIndexNum = number[index1];
                int secondIndexNum = number[index2];
                number[index1] = secondIndexNum;
                number[index2] = firstIndexNum;

            } else if (input.contains("multiply")) {
                String[] command = input.split(" ");
                int index1 = Integer.parseInt(command[1]);
                int index2 = Integer.parseInt(command[2]);

                int firstIndexNum = number[index1];
                int secondIndexNum = number[index2];

                int product = firstIndexNum * secondIndexNum;
                number[index1] = product;

            } else if (input.contains("decrease")) {
                for (int i = 0; i < number.length; i++) {
                    number[i]--;
                }

            }
            input = scanner.nextLine();
        }
        for (int index = 0; index <= number.length - 1; index++) {
            int currentNumber = number[index];
            if (index != number.length - 1) {
                System.out.print(currentNumber + ", ");
            } else { //index == numbers.length - 1
                //последния индекс -> последното число в масива
                System.out.print(currentNumber);
            }
        }
    }
}
