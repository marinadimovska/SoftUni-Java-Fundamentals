import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int source = Integer.parseInt(scanner.nextLine()); //бр. подправки в полето
        //всеки ден - добив = yield - 26 подправки; намалям бр. на подправките с 10
        //стоп - бр. на подправките е по-малък от 100
        int days = 0;
        int totalAmountSpices = 0;//общ бр.добити подправки
        while (source>=100){
            int spices = source - 26; //добив
            totalAmountSpices += spices;
            days++;
            source -=10;
        }
        System.out.println(days);
        if (totalAmountSpices>=26){
            totalAmountSpices -= 26;
        }
        System.out.println(totalAmountSpices);

    }
}
