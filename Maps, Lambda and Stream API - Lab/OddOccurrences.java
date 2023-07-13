import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        //Java C# PHP PHP JAVA C java
        LinkedHashMap<String,Integer> wordsMap = new LinkedHashMap<>();

        for (String s : inputArr) {
            s = s.toLowerCase(Locale.ROOT);
            if(!wordsMap.containsKey(s)){
                wordsMap.put(s, 0);
            }
            wordsMap.put(s, wordsMap.get(s)+1);
        }
        ArrayList<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> e : wordsMap.entrySet()) {
            if(e.getValue()%2!=0){
                resultList.add(e.getKey());
            }
        }
        System.out.println(String.join(", ",resultList));


    }
}
