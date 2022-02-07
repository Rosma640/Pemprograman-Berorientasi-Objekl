public class Handphone {
    static String jenis_hp;
    static int tahun_pembuatan;
    public String setDataHP(String jenis_hp, int tahun_pembuatan){
        jenis_hp = jenis_hp;
        tahun_pembuatan = tahun_pembuatan;
        return "ini string";
    }
    String getJenisHP(){
        return jenis_hp;
    }
    int getTahunPembuatan(){
        return tahun_pembuatan;
    }
    public static void main (String args[]) {
        Handphone hp = new Handphone();
        hp.setDataHP(jenis_hp, tahun_pembuatan);
        hp.getJenisHP();
        hp.getTahunPembuatan();
    }
}
