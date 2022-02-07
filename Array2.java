/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Rosmawati
 * *20200040096
 * *TI20E
 */

public class Array2 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan nominal uang : ");
            
            int uangMasuk = input.nextInt();
            int jumlahTahu = 35;
            if (uangMasuk < 2000) {
                System.out.println("Maaf tahu harganya 2000, uang anda tidak cukup");
            }
            tampilRak(uangMasuk);
        }
        catch (InputMismatchException e) {
            System.out.println("Input harus angka");
        }
    }
    
    public static void formatRack(String[][] rack) {
        for (String[] barisRak: rack) {
            for (int i = 0; i < barisRak.length; i++) {
                if (i == 0) {
                    System.out.print(barisRak[i] + " ");
                }
                if (i == 1 || i == 2 || i == 4 || i == 5) {
                    System.out.print(barisRak[i]);
                } 
                if (i == 3) {
                    System.out.print(" " + barisRak[i] + " ");
                }
                if (i == 6) {
                    System.out.print(" " + barisRak[i]);
                }
            }
            System.out.println();
        }
    }
    
    public static void tampilRak(int uangMasuk) {
        final int defaultTotalHarga = 70000;
        int uangMasukRemain = (uangMasuk % 2000);
        int totalHarga = defaultTotalHarga - (uangMasuk - uangMasukRemain);
        int totalTahuTerbeli = 0;
        String[][] finalRack = new String[5][7];
        
        for (int i = finalRack.length - 1; i >= 0; i--) {
            for (int j = finalRack[i].length - 1; j >= 0; j--) {
                if (totalHarga >= 2000 && totalHarga % 2000 == 0) {
                    finalRack[i][j] = "#";
                } else {
                    finalRack[i][j] = " ";
                    totalTahuTerbeli++;
                }
                totalHarga -= 2000;
            }
        }
        String konfirmasiPembelian = "Anda mendapat " + totalTahuTerbeli + " tahu ";
        if (uangMasuk >= defaultTotalHarga) {
            konfirmasiPembelian += " kembalian " + (uangMasuk - defaultTotalHarga);
        }
        if (uangMasuk % 2000 != 0) {
            konfirmasiPembelian += " kembalian " + uangMasukRemain;
        }
        System.out.println(konfirmasiPembelian);
        formatRack(finalRack);
    }

}
