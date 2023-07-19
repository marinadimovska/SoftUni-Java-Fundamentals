import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        //Linux, Windows
        String text = scanner.nextLine();
        for (int i = 0; i < bannedWords.length ; i++) {
            String banWord = bannedWords[i];
            String star = RepeatString(banWord);
            text = text.replace(banWord,star);

        }
        System.out.println(text);
    }
    public static String RepeatString(String banWord){
        String result = "";
        for (int i = 0; i <banWord.length() ; i++) {

            result = result+ "*";
        }
        return result;
    }
}
