import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String kata = "";
        String reversedKata = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kata : ");
        kata = input.nextLine();
        reversedKata = reverse(kata);
        
        if (kata.toLowerCase().equals(reversedKata.toLowerCase())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Bukan Palindrome");
        }
    }
    
    public static String reverse(String stringObj) {
        String reverseStringObj = "";
        for (int i = stringObj.length() - 1; i >= 0; i--) {
            reverseStringObj += stringObj.substring(i, i + 1);
        }
        return reverseStringObj;
    }
}
