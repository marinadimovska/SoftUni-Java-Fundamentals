import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            // 14 % 10 -> 14 / 10
            int curNum = i;//11
            int sum = 0;
            while(curNum>0){
                sum += curNum % 10;//1
                curNum = curNum /10;//1
            }
            boolean isSpecial = sum == 5 || sum == 7 || sum == 11;
            if(isSpecial){
                System.out.printf("%d -> True%n", i);
            }else{
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
