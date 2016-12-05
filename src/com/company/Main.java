//Nils.E.L 2016

package com.company;


import javax.swing.*;

public class Main {
    //sida 122, uppgift 5.8
    public static void del1() {

        String rader = JOptionPane.showInputDialog(null, "Hur många rader? (endast hel tal)"); //Läser in antal rader man vill ha
        int antalrader = Integer.parseInt(rader);                                                                    //konveterar stringen till en int
        int test = 0;
        String displaystring = "";

        for (int i = 1; i <= antalrader; i++) {
            //går igenom alla rader
            for (int n = 1; n <= i; n++) {
                //tar raden gånger i om i är mindre är lika med raden
                int displaynumbs = i * n;
                //lägger till raden i stringen
                displaystring = displaystring + Integer.toString(displaynumbs) + " ";
            }

            displaystring = displaystring + "\n";  //radbyte

        }
        JOptionPane.showMessageDialog(null, displaystring);

    }

    public static void del2() {
        //sida 122, 5.7
        double x = 0;
        double i = 1;
        double eivind = 1;

        while(eivind/i >  0.00001) {
            x += eivind/i;
            i++;
            x -= eivind/i;
            i++;


            }

        System.out.print("ett delat på " + x +" är mindre än 0.00001");
       }










    public static void main(String[] args) {
        del2();

    }
}
