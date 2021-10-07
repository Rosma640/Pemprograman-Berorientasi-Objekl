import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        int nilai;
        String grade;
        String hasil;
        Scanner scan = new Scanner(System.in);

        System.out.print("Nilai Coding : ");
        nilai = scan.nextInt();

        if ( nilai >= 80 ) {
            grade = "A";
            hasil = "Selamat Kamu Berhasil Menjadi Calon Programmer";
            System.out.println("LOLOS");
        } else if ( nilai >= 60 && nilai < 80 ){
            grade = "B";
            hasil = "Selamat Kamu Berhasil Menjadi Calon Programmer";
            System.out.println("DIPERTIMBANGKAN");
        } else if ( nilai < 60 ){
            grade = "C";
            hasil ="Maaf Kamu Belum Berhasil Menjadi Calon Programmer";
            System.out.println("GAGAL");
        } else {
            grade = "D";
            hasil ="Maaf Kamu Belum Berhasil Menjadi Calon Programmer";
            System.out.println("GAGAL");
        }
        System.out.println("Nilai Interview: " + grade);
        System.out.println("" + hasil);
    }
}
