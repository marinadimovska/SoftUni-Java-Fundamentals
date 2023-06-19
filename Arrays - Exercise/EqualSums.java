import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftSum = 0;
        int rightSum =0;
        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int index = 0; index <= numbers.length -1 ; index++) {
            int curNum = numbers[index];
            //да намеря сумата на ел от ляво
            //л.сума – вс.ел от 1вия до моя елемент,без да го вкл
            for (int leftIndex = 0; leftIndex < index ; leftIndex++) {
                leftSum+=numbers[leftIndex];
            }
            //да намеря сумата на елементите от дясно
            //вс. елементи след моя
            for (int rightIndex = index+1; rightIndex <=numbers.length-1 ; rightIndex++) {
                rightSum+=numbers[rightIndex];
            }

            if(leftSum==rightSum){
                System.out.println(index);
                return;//пректратява цялата програма
            }
        }
        System.out.println("no");
    }
}
