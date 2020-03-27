package de.hsos.prog3.gbuccell.ab02.logik;

public class Simulator implements Simulation {

    private boolean[][] spielfeld;
    private int anzahlFelder;

    private BeiAenderung beiAenderung;

//Setter, Getter
    private void setSpielfeld(boolean[][] spielfeld){
        this.spielfeld = spielfeld;
    }
    public boolean[][] getSpielfeld(){
        return spielfeld;
    }
    private void setAnzahlFelder(int anzahlFelder){
        this.anzahlFelder = anzahlFelder;
    }
    public int getAnzahlFelder(){
        return anzahlFelder;
    }

//Methoden
    @Override
    public void berechneAnfangsGeneration(int anzahlDerZellen, int wahrscheinkeitDerBesiedlung){
        //beiAenderung.aktualisiere();
    }

    @Override
    public void berechneFolgeGeneration(int berechnungsschritte){
        //beiAenderung.aktualisiere();
    }

    @Override
    public void anmeldenFuerAktualisierungBeiAenderung(BeiAenderung beiAenderung){

    }



}
