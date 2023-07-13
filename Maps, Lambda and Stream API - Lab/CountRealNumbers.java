import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numsArr = Arrays.stream(scanner.nextLine().split(" ")).
                mapToDouble(Integer::parseInt).toArray();
        TreeMap<Double,Integer> countMap = new TreeMap<>();
        //8 2 2 8 2
        for (double n:numsArr) {
            if(!countMap.containsKey(n)) {
                countMap.put(n, 0);
            }

            countMap.put(n,countMap.get(n)+1);
        }
        for (Map.Entry<Double, Integer> e : countMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", e.getKey(),e.getValue());
        }
    }
}
