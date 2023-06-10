import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        //English is spoken in England and USA;
        //Spanish is spoken in Spain, Argentina, and Mexico; for the
        //others, we should print "unknown".
        if (country.equals("USA")||country.equals("England")||country.equals("Spain")||
                country.equals("Argentina")||country.equals("Mexico")){
            switch (country){
                case "USA":
                case "England":
                    System.out.println("English");
                    break;
                case "Spain":
                case "Mexico":
                case "Argentina":
                    System.out.println("Spanish");
                    break;
            }
        }
        else{
            System.out.println("unknown");
        }
    }
}
