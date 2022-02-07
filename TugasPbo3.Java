import java.util.Scanner;
public class PboSoal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Nama : ");
        String nama = scan.next();
        System.out.println("Umur :");
        int umur = scan.nextInt();
        System.out.println("Tempat Tinggal :");
        Scanner scan1=new Scanner(System.in);
        String tempatTinggal = scan1.nextLine();
        System.out.println("Uang Tabungan :");
        int uangTabungan = scan.nextInt();
        
        if (umur>=18 && umur<=24) {
            if (tempatTinggal.equalsIgnoreCase("California")|| tempatTinggal.equalsIgnoreCase("Detroit") || tempatTinggal.equalsIgnoreCase("Boston") && uangTabungan < 1000) {
                String pangkat="Don";
                System.out.println(nama+" kemungkinan adalah seorang anggota mafia dengan pangkat "+pangkat);
            } else {
                System.out.println(nama+" tidak mencurigakan"); 
            }
        } 
        else if (umur>=25 && umur<=40){
            if (tempatTinggal.equalsIgnoreCase("New Jersey")|| tempatTinggal.equalsIgnoreCase("Manhattan") || tempatTinggal.equalsIgnoreCase("Nevada")
                & (uangTabungan >=1000 && uangTabungan <=2000)) {
                String pangkat="Underboss";
                System.out.println(nama+" kemungkinan adalah seorang anggota mafia dengan pangkat "+pangkat);
            } else {
                System.out.println(nama+" tidak mencurigakan"); 
            }
        }  
        else if (umur>40){
             if (tempatTinggal.equalsIgnoreCase("Nevada")|| tempatTinggal.equalsIgnoreCase("New York")|| tempatTinggal.equalsIgnoreCase("Havana") && uangTabungan > 10000) {
                 String pangkat="Capo";
                System.out.println(nama+" kemungkinan adalah seorang anggota mafia dengan pangkat "+pangkat);
            } else {
                System.out.println(nama+" tidak mencurigakan"); 
            }
        }
        else{
            System.out.println("Kesalahan !");
        }
    }
}
