public class OperatorTernary {
    public static void main(String[] args) {
        int uang = 50000;
        int harga = 55000;
        
        String hasil = uang < harga? "Uang anda tidak cukup untuk membeli mainan ini":"Uang anda cukup untuk membeli mainan ini";
        
        System.out.println(hasil);
    }   
}
