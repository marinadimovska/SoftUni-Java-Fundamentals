import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //number of people
        int n = Integer.parseInt(scanner.nextLine());
        //capacity
        int p = Integer.parseInt(scanner.nextLine());
        int fullCourses = (int) Math.ceil((double)n/p); //17/3=5

        System.out.println(fullCourses);
    }
}
