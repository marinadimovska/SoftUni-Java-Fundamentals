import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");
        ArrayList<String> resultList = new ArrayList<>();

        for (String s : wordsArr) {
            if(s.length()%2==0){
                resultList.add(s);
            }
        }

        System.out.println(String.join(System.lineSeparator(), resultList));
       // String[] wordsArr = Arrays.stream(Arrays.stream(scanner.nextLine().split(" "))
        //        .filter(w -> w.length() %2 == 0)
        //                .toArray(String[]::new);
    }
}
