import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        //Ivan Ivanov, Ivan ivanov, ivan Ivanov, IVan Ivanov, Georgi
        //Georgiev, Ivan Ivanov
        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";//текст на шаблона
        Pattern pattern = Pattern.compile(regex);//шаблон
        Matcher matcher = pattern.matcher(text);//съвкупност от текстовете от променливата текст,които
        //отговарят на шаблона мачер "Ivan Ivanov"
        while(matcher.find()){
            System.out.printf(matcher.group() + " ");
        }
    }
}
