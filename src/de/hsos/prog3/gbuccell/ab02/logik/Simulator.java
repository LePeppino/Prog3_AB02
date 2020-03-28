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

    public int getAnzahlFelder(){
        return anzahlFelder;
    }

//Methoden
    @Override
    public void berechneAnfangsGeneration(int anzahlZellen, int wahrscheinlichkeitBesiedlung){
        boolean[][] spielfeld = new boolean[(int)Math.sqrt(anzahlZellen)][(int)Math.sqrt(anzahlZellen)];
        Random random = new Random();
        for(int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                int zufall = random.nextInt();
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
