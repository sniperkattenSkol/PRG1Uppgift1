//Nils.E.L 2016

package com.company;


import javax.swing.*;

public class Main {
    //sida 122, uppgift 5.8
    public static void del1() {

        String rader = JOptionPane.showInputDialog(null,"Hur många rader? (endast hel tal)"); //Läser in antal rader man vill ha
        int antalrader = Integer.parseInt(rader);                                                                    //konveterar stringen till en int
        int test = 0;
        String displaystring = "";

        for(int i = 1; i <= antalrader; i++){
            //går igenom alla rader
            for(int n = 1; n<=i; n++) {
                //tar raden gånger i om i är mindre är lika med raden
                int displaynumbs = i*n;
                //lägger till raden i stringen
                displaystring = displaystring + Integer.toString(displaynumbs) + " ";
            }

            displaystring = displaystring + "\n";  //radbyte

        }
        JOptionPane.showMessageDialog(null, displaystring);
    }

    public static void main(String[] args) {
        del1();

    }
}
