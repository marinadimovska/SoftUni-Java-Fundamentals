import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] trainArr= new int[n];
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            trainArr[i] = Integer.parseInt(scanner.nextLine());
            sum +=trainArr[i];
        }

        for (int num: trainArr) {
            System.out.printf(num + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}