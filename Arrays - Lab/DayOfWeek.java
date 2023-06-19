import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        if(n<=0 || n>7){
            System.out.println("Invalid day!");
        }else {
            String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                    "Sunday"};

            System.out.println(dayOfWeek[n - 1]);

        }
    }
}
