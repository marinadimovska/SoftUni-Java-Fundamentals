import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); //number of snowballs
        double snowballValueMax= 0;
        int snowballSnowBiggest = 0;
        int snowballTimeBiggest = 0;
        int snowballQualityBiggest = 0;
        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime= Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            //power of snowballs
            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);
            if(snowballValue>snowballValueMax){
                snowballValueMax = snowballValue;
                snowballSnowBiggest = snowballSnow;
                snowballTimeBiggest = snowballTime;
                snowballQualityBiggest = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d) ",snowballSnowBiggest,
                snowballTimeBiggest, snowballValueMax ,snowballQualityBiggest );    }
}
