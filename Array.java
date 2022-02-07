/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import java.util.Arrays;

/**
 *
 * @author Rosmawati
 * *20200040096
 * *TI20E
 */
public class Array1 {
    public static void main(String[] args) {
        String[] boxOfUnorganized = {"Apel","Pisang","Anggur","Jambu","Pepaya","Duku","Durian","Jeruk","Mangga","Manggis",};
        int boxIndex = 0;
        int containerBoxIndex = 0;
        int boxSize = boxOfUnorganized.length;
        
        String[] boxOfOrganized = sortItems(boxOfUnorganized);
        String[][] boxesOfOrganized = new String[5][2];
        String pointer = boxOfOrganized[0];
        for (int i = 0; i < boxOfOrganized.length; i++) {
            if (pointer.charAt(0) != boxOfOrganized[i].charAt(0)) {
                pointer = boxOfOrganized[i];
                containerBoxIndex++;
                boxIndex = 0;
            }
            if (pointer.charAt(0) == boxOfOrganized[i].charAt(0)) { 
                boxesOfOrganized[containerBoxIndex][boxIndex] = boxOfOrganized[i];
                boxIndex += 1;
            } 
        }
        System.out.println(""+ Arrays.deepToString(boxesOfOrganized));
    }
    public static String[] sortItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            String temp = items[i];
            int position = i;
            while( position >= 1 && items[position - 1].charAt(0) > temp.charAt(0) ) {
                items[position] = items[position - 1];
                position--;
            }
            items[position] = temp;
        }
        return items;
    }

}
