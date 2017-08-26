/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romplan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author patrick
 */
public class Data {
    private static final String FILNAVN = showInputDialog("hvor ligger filen");
    
    public static Reservasjon[] hent() {
        try {
            String[] data;
            int antall;
            Scanner leser;
            Reservasjon[] resTab;
            File fil = new File(FILNAVN);
            leser = new Scanner(fil);
            antall = Integer.parseInt(leser.nextLine());
            resTab = new Reservasjon[antall];
            int i = 0;
            do {
                data = leser.nextLine().split(";");
                Dato dato = new Dato(Integer.parseInt(data[2]),Integer.parseInt(data[3]),Integer.parseInt(data[4]));
                KlSlett fra = new KlSlett(Integer.parseInt(data[5]),Integer.parseInt(data[6]));
                KlSlett til = new KlSlett(Integer.parseInt(data[7]),Integer.parseInt(data[8]));
                resTab[i] = new Reservasjon(data[0],Integer.parseInt(data[1]),dato,fra,til);
                i++;
            } while (leser.hasNextLine());
            leser.close();
            return resTab;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        Reservasjon[] fileNotFound = new Reservasjon[0];
        return fileNotFound;
    }

    public void lagre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
