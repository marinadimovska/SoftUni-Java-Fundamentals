import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //headset, mouse, keyboard, and display
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine()) ;
        double mousePrice =Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double totalSum = 0;

        int headsetCount = lostGamesCount /2; //бр. счупени слушалки
        int mouseCount = lostGamesCount /3; //бр. счупени мишки
        int keyboardCount = lostGamesCount /6; //бр. счупени клавиатури
        int DisplayCount = lostGamesCount /12; //бр. счупени монитори

        totalSum = headsetCount * headsetPrice + mouseCount * mousePrice
                +keyboardCount * keyboardPrice + displayPrice * DisplayCount;

        System.out.printf("Rage expenses: %.2f lv.", totalSum);

    }
}
