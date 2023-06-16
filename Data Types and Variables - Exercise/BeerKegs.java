import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String maxVolKeg = "";
        for (int i = 0; i <n ; i++) {
            //First – model – string
            //Second –radius – floating-point number
            //Third – height – integer number

            String model = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
           // π * r^2 * h.
            double volume = Math.PI * radius*radius *height;
            if(volume>maxVolume){
                maxVolume = volume;
                maxVolKeg = model;
            }
        }
        System.out.println(maxVolKeg);
    }
}
