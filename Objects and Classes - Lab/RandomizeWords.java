import java.util.Random;
import java.util.Scanner;

public class RandomizeWords{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArr = scanner.nextLine().split(" ");

        Random rnd = new Random();

        for (int j = 0; j <wordsArr.length ; j++) {
            int rndIndexX = rnd.nextInt(wordsArr.length);
            int rndIndexY = rnd.nextInt(wordsArr.length);

            String oldWord = wordsArr[rndIndexX];
            wordsArr[rndIndexX]=wordsArr[rndIndexY];
            wordsArr[rndIndexY] = oldWord;

        }
        System.out.println(String.join(System.lineSeparator(),wordsArr));
    }
}
