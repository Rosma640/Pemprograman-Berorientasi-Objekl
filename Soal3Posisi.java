public class PboSoal3 {
  public static void main(String[] args) {
    int nomor = 98;
    String posisi = "";
    
    if (nomor % 2 == 0) {
      posisi += " - Target Attacker";

      if (nomor >= 50 && nomor <= 100) {
        posisi += " - Capten team";
      }
    }
    if (nomor % 2 == 1) {
      posisi += " - Defender";

      if (nomor > 90) {
        posisi += " - Playmaker";
      }
    }
    if (nomor % 3 == 0 || nomor % 5 == 0) {
      posisi += " - Keeper";
    }
      System.out.println("Posisi :" +posisi);

  }
    }
