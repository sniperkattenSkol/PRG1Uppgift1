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



public static void del3(){
        // tar in ordet/namnet/charsen
        String ordinput = JOptionPane.showInputDialog("Palindrom check (Only letter)");
        // får ut hur långt ordet är samt tar bort en för att göra så den fungerar med charat ( den börjar på noll)
        int ordlen = ordinput.length();
        ordlen--;
        //int för att kontrollera om den har gått igenom hela ordet utan problem
        int janej = 2;
        //chars
        char c1, c2;
        ordLoop:
        // går igenom hela ordets längd
        for(int i = 0; i < ordinput.length(); i++) {
             //tar bokstaven @i
            c1 = ordinput.charAt(i);
            //Tar bokstaven @ ordlen.
             c2 = ordinput.charAt(ordlen);

            //kontrollerar om bokstaven från @ordlen är lika med bokstaven från @i
            if (c2 == c1){
                //tar bort en från ordlen så att den tar den nästa bokstaven.
                ordlen--;


            } else {
                // Om den inte stämmer så blir kontroll inten en mindre
                janej--;
                //hoppar ur loopen.
                break ordLoop;


            }
                //om kontroll variabeln är 2 så är ordet ett palindrom
        }       if(janej == 2) {
                     JOptionPane.showMessageDialog(null, "(" + ordinput + ") är ett palindrom.");
                     //om kontroll variabeln inte är 2 så är det inte ett palindrom
                }else{
                     JOptionPane.showMessageDialog(null, "(" + ordinput + ") är inte ett palindrom.");
                }

}







    public static void main(String[] args) {
        del3();

    }
}
