import java.util.Scanner;

public class BackIn30Minutes {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int hr = Integer.parseInt(scanner.nextLine());
            int mins = Integer.parseInt(scanner.nextLine());
            mins = mins +30;



            if (mins >= 60) {
                mins = mins - 60;
                hr = hr + 1;
            } if (hr >= 24){
                hr = hr - 24;
            }  if (mins < 10) {
                System.out.println(hr + ":0" + mins);
            } else {
                System.out.println(hr + ":" + mins);
            }

        }
    }