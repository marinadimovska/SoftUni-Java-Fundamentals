import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());//5
        int capacity = 0;
        for (int i = 1; i <=n ; i++) {
            int quantities = Integer.parseInt(scanner.nextLine());//100
            capacity +=quantities;
            if(capacity>255){
                System.out.println("Insufficient capacity!");
                capacity -= quantities;
            }
        }
        System.out.println(capacity);
    }
}
