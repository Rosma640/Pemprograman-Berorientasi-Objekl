import java.util.Scanner;
public class PboSoal4 {
    public static class Olahraga {
    public int DurasipushUpDalamMenit;
    public int DurasiPlankDalamMenit;
    public int DurasiLariDalamMenit;
    
    Olahraga( int DurasipushUpDalamMenit, int DurasiPlankDalamMenit, int DurasiLariDalamMenit) {
        this.DurasipushUpDalamMenit = DurasipushUpDalamMenit;
        this.DurasiPlankDalamMenit = DurasiPlankDalamMenit;
        this.DurasiLariDalamMenit = DurasiLariDalamMenit;
    }
  }
    public static void main(String[] args) {
        Olahraga asep = new Olahraga(80, 5, 5);
        getWorkoutSummary(asep);
    }
    
    public static void getWorkoutSummary(Olahraga manusia) {
        final double KaloriYangHilangPerMenitSaatpushUp = 7;
        final float KaloriYangHilangPerMenitSaatPlank = 5;
        final float KaloriYangHilangPerMenitSaatLari = 60;
        
        int DurasipushUp = manusia.DurasipushUpDalamMenit;
        int DurasiPlank = manusia.DurasiPlankDalamMenit;
        int DurasiLari = manusia.DurasiLariDalamMenit;
        
        System.out.println("Pushup anda menghilangkan " + (double) (KaloriYangHilangPerMenitSaatpushUp * DurasipushUp) + " kalori");
        System.out.println("Plank anda menghilangkan " + (float) (KaloriYangHilangPerMenitSaatPlank * DurasiPlank) + " kalori");
        System.out.println("Lari anda menghilangkan " + (float) (KaloriYangHilangPerMenitSaatLari * DurasiLari) + " kalori");
    }
}
