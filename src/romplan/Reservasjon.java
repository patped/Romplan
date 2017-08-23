/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romplan;

/**
 *
 * @author patrick
 */
public class Reservasjon {
    private String navn;
    private int rom;
    private Dato dato;
    private KlSlett start;
    private KlSlett slutt;

    public Reservasjon(String navn, int rom, Dato dato, KlSlett start, KlSlett slutt) {
        this.navn = navn;
        this.rom = rom;
        this.dato = dato;
        this.start = start;
        this.slutt = slutt;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public KlSlett getStart() {
        return start;
    }

    public void setStart(KlSlett start) {
        this.start = start;
    }

    public KlSlett getSlutt() {
        return slutt;
    }

    public void setSlutt(KlSlett slutt) {
        this.slutt = slutt;
    }

    @Override
    public String toString() {
        return "Reservasjon{" + "navn=" + navn + ", rom=" + rom + ", dato=" + dato + ", start=" + start + ", slutt=" + slutt + '}';
    }
    
    
}
