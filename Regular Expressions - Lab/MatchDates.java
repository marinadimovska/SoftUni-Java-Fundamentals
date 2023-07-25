import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //13/Jul/1928, 10-Nov-1934, , 01/Jan-1951,f 25.Dec.1937 23/09/1973, 1/Feb/2016
        String regex = "(?<day>\\d{2})(?<separator>[\\.\\-\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        //Day: 13, Month: Jul, Year: 192
        while(matcher.find()){
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n",day,month,year );
        }
    }
}
