import java.util.Scanner;
public class PalindromeTerdekat {
  public static void main(String[] args) {
      int angka;
      int angkaPalindrome;
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan Angka :  ");
      angka = input.nextInt();
      
      if (angka <10 ) {
          angkaPalindrome = 0;
      }
      angkaPalindrome = findClosestPalindrome(angka+2);
      System.out.println("Palindrome terdekat adalah : " + angkaPalindrome);
  }
  public static int findClosestPalindrome(int number) {
      int closestPalindrome;
      while (!isPalindrome(number)) {
          number++;
      }
      return number;
  }
  
  public static boolean isPalindrome(int number) {
      int reversedNumber = reverseNumber(number);
      return reversedNumber == number;
  }
  
  public static int reverseNumber(int number) {
      int reversedNumber = 0;
      while (number != 0) {
          int remainNumber = number % 10;
          reversedNumber = reversedNumber * 10 + remainNumber;
          number = number / 10;
      }
      return reversedNumber;
  }
}
