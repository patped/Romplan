/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romplan;

import javax.swing.JOptionPane;

/**
 *
 * @author patrick
 */
public class RomplanApp2 {

    private static final int ANTALL = 10;
    private static final Reservasjon[] RESTAB = new Reservasjon[ANTALL];    
    
/*
    public static void main(String[] args) {
        
        lesFraFil();
        Reservasjon ny = lesFreBruker();
        leggInn(ny);
        skrivTilFil();
        
    }
*/
    
   private static void leggInn(Reservasjon ny) {
       RESTAB[RESTAB.length-1] = ny;
   }

    private static void skrivTilFil() {
        for (Reservasjon r1 : RESTAB) {
            System.out.println(r1);
        }
    }
    
    private static Reservasjon lesFreBruker() {
        String navn = JOptionPane.showInputDialog("Skriv navn");
        int dag = Integer.parseInt(JOptionPane.showInputDialog("skriv dag"));
        int mnd = Integer.parseInt(JOptionPane.showInputDialog("skriv mnd"));
        int år = Integer.parseInt(JOptionPane.showInputDialog("Skriv år"));
        Dato dato = new Dato(dag,mnd,år);
        
        int time = Integer.parseInt(JOptionPane.showInputDialog("skriv time"));
        int min = Integer.parseInt(JOptionPane.showInputDialog("skriv minutt"));
        KlSlett start = new KlSlett(time,min);
        
        time = Integer.parseInt(JOptionPane.showInputDialog("skriv time"));
        min = Integer.parseInt(JOptionPane.showInputDialog("skriv minutt"));
        KlSlett slutt = new KlSlett(time,min);
        
        int romnr = Integer.parseInt(JOptionPane.showInputDialog("skriv romnr"));
        Reservasjon reservasjon =  new Reservasjon(navn,romnr,dato,start,slutt);
        
        return reservasjon;
    }

    private static void lesFraFil() {
        
        for (int i=0; i<ANTALL-1; i++) {
            KlSlett k1 = new KlSlett(10,15);        
            KlSlett k2 = new KlSlett(11,13);
            Dato d1 = new Dato(28,12,1988);
            Reservasjon r1 = new Reservasjon("Ola",i+1,d1,k1,k2);
            RESTAB[i]=r1;
        }
    }
}
