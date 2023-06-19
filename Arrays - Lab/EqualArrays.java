import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr1 = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();

        int[] numArr2= Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        int diffIndex = -1;
        for (int i = 0; i < numArr1.length ; i++) {
            int firstNum = numArr1[i];
            int secondNum = numArr2[i];

            if(firstNum == secondNum){
                    sum += firstNum;
                }
                else{
                    diffIndex = i;
                    break;
                }
        }
        if(diffIndex == -1) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }else{
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffIndex);
        }
    }
}
