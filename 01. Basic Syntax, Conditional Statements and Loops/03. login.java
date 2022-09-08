import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        boolean isCorrect = true;
        int count = 0;

        for (int i = username.length() - 1; i >= 0 ; i--) {
            password += username.charAt(i);
        }
        while(true){
            username = scanner.nextLine();
            if(username.equals(password)) {
                System.out.printf("User %s logged in.", username);
                break;
            }else{
                count++;
                if(count == 4){
                    System.out.printf("User %s blocked", username);
                    break;
                }
            }
            System.out.println("Incorrect password! Try again!");
        }

    }
}
