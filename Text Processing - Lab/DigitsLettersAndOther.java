import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        //Agd#53Dfg^&4F53
        StringBuilder digits = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder other = new StringBuilder();
        for (int i = 0; i < str.length() ; i++) {
            char curSym = str.charAt(i);//A
            if(Character.isDigit(curSym)){
                digits.append(curSym);
            } else if (Character.isLetter(curSym)) {
                letter.append(curSym);
            } else{
                other.append(curSym);
            }
        }
        System.out.println(digits);
        System.out.println(letter);
        System.out.println(other);
    }
}
