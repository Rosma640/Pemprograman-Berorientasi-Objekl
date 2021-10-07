import java.util.Scanner;

public class HitungGrade {
    public static void main(String[] args) {
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        System.out.print(" Nilai Coding : ");
        nilai = scan.nextInt();

        if ( nilai >= 80 ) {
            grade = "A";
            System.out.println("LOLOS");
        } else if ( nilai >= 60 && nilai < 80 ){
            grade = "B";
            System.out.println("DIPERTIMBANGKAN");
        } else if ( nilai < 60 ){
            grade = "C";
            System.out.println("GAGAL");
        } else {
            grade = "D";
            System.out.println("GAGAL");
        }
        System.out.println(" Nilai Interview: " + grade);
    }
}
