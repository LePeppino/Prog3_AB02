/*
 * Titel: Programmieren 3, AB02
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
 */

package de.hsos.prog3.gbuccell.ab02.logik;

import java.util.Random;

public class Simulator implements Simulation {

    private boolean[][] spielfeld;
    private int anzahlFelder;

    private BeiAenderung beiAenderung;

    //Simulator-Objekt muss initialisiert werden, um auf Methoden anwendbar zu sein
    public Simulator(int ersteDimension, int zweiteDimension, int anzahlFelder){
        this.spielfeld = new boolean[ersteDimension][zweiteDimension];
        this.anzahlFelder = anzahlFelder;
    }

    public int getAnzahlFelder(){
        return anzahlFelder;
    }

//Methoden
    @Override
    public void berechneAnfangsGeneration(int anzahlZellen, int wahrscheinlichkeitBesiedlung){
        Random random = new Random();
        for(int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                int zufall = random.nextInt(100);
                if(zufall < wahrscheinlichkeitBesiedlung){
                    spielfeld[i][j] = true;
                }
                spielfeld[i][j] = false;
            }
        }
        beiAenderung.aktualisiere(spielfeld);
    }

    @Override
    public void berechneFolgeGeneration(int berechnungsschritte){
        //beiAenderung.aktualisiere();
    }

    @Override
    public void anmeldenFuerAktualisierungBeiAenderung(BeiAenderung beiAenderung){

    }



}
