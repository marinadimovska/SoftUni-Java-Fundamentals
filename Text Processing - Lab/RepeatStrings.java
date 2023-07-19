import java.util.ArrayList;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArr = scanner.nextLine().split(" ");

        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i <wordsArr.length ; i++) {
            String curWord = wordsArr[i];
            String repeatedWord = RepeatString(wordsArr[i]);
            resultList.add(repeatedWord);
        }
        System.out.println(String.join("", resultList));
    }
    public static String RepeatString(String word){
        String result = "";
        for (int i = 0; i <word.length() ; i++) {
            result += word;
        }
        return result;
    }
}
