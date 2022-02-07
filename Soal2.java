import java.util.Scanner;
public class PboSoal2 {
    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
        int nilai;
        String nilaiCoding = "";
        String nilaiInterview = "";
        System.out.print("Nilai Coding : ");
        nilai = in.nextInt();
        
        if ( nilai > 80 ) {
            nilaiCoding = "LOLOS";
            nilaiInterview = "A";
        }  
        else if ( nilai > 60 & nilai < 80 ) {
            nilaiCoding = "DIPERTIMBANGKAN";
            nilaiInterview = "B";
        }
        
        else if ( nilai < 60 ) {
            nilaiInterview = "GAGAL";
        }
        
        if ("LOLOS".equals(nilaiCoding) || "DIPERTIMBANGKAN".equals(nilaiCoding) && ("A".equals(nilaiInterview) || nilaiInterview == "B")){
            System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer");
        }else{
            System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
        }
    }
}
