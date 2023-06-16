import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());//n
        int startPower = power;
        int distance = Integer.parseInt(scanner.nextLine());//m
        int factor = Integer.parseInt(scanner.nextLine());//y

        //силата я намаляме с разстоянието
        //стигаме до целта
        //намушкваме целта
        //стоп сила по-малко от разстоянието

        int count = 0;
        while(power>=distance){
            power -= distance;
            count++;
            //проверка за умора
            if(power==startPower/2) {
                if (factor != 0) {
                    power = power / factor;
                }
            }
        }
        System.out.println(power);
        System.out.println(count);
    }
}
