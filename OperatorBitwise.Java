public class OperatorBitwise {
    public static void main(String[] args) {
        int a = 100;    
        int b = 20;    
        int c = 528;
        int d = 70;
        int e = 256;
        int f = 3;
        int g = 128;
        int h = 5;
        int i = 600;
        int j = 4;
        int k = 423;
        int l = 2;
        int jumlah = 0;

        jumlah = a & b;       
        System.out.println("a & b = " + jumlah);

        jumlah = c | d;      
        System.out.println("c | d = " + jumlah);

        jumlah = e >> f;    
        System.out.println("e >> f  = " + jumlah);
        
        jumlah = g << h;    
        System.out.println("g << h = " + jumlah);
        
        jumlah = i >> j;    
        System.out.println("i >> j  = " + jumlah);
        
        jumlah = k << l;    
        System.out.println("k << l = " + jumlah);
    }

}
