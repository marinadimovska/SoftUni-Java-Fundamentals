import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //+359 2 222 2222
        //+358 {areaCode=2} {3digits} {4digits}
        String phoneNum = scanner.nextLine();
        String regex = "\\+359([ -])2\\1\\d{3}\\1\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNum);
        List<String> validPhoneNum = new ArrayList<>();

        while(matcher.find()){
            validPhoneNum.add(matcher.group());
        }
        System.out.printf(String.join(", ", validPhoneNum));

    }
}
