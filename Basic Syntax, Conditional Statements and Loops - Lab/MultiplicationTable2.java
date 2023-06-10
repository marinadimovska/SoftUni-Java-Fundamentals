import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = Integer.parseInt(scanner.nextLine());
        if(startNumber>10){
            System.out.println(number +" X " + startNumber + " = " + number*startNumber);
        }

        for (int i = startNumber; i <=10 ; i++) {
            System.out.println(number +" X " + i + " = " + number*i);
        }
    }
}
