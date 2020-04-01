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

//Methoden
    @Override
    public void berechneAnfangsGeneration(int anzahlZellen, int wahrscheinlichkeitBesiedlung){
        this.spielfeld = new boolean[(int)Math.sqrt(anzahlZellen)][(int)Math.sqrt(anzahlZellen)];
        this.anzahlFelder = anzahlFelder;
        Random random = new Random();
        for(int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                int zufall = random.nextInt(100);
                if(zufall < wahrscheinlichkeitBesiedlung){
                    spielfeld[i][j] = true;
                }else {
                    spielfeld[i][j] = false;
                }
            }
        }
        if(beiAenderung != null){
            beiAenderung.aktualisiere(spielfeld);
        }
    }

    @Override
    public void berechneFolgeGeneration(int berechnungsschritte) throws InterruptedException {
        int schritt = 0;
        while(schritt < berechnungsschritte) {
            for (int i = 0; i < spielfeld.length; i++) {
                for (int j = 0; j < spielfeld[i].length; j++) {
                    int nachbarn = zeahleNachbarn(i, j);
                    //1. Regel: Zelle mit 3 Nachbarn wird wiederbelebt
                    if(nachbarn == 3 && !spielfeld[i][j]){
                        spielfeld[i][j] = true;
                    }

                    //2. Regel: Tod durch Unterbevoelkerung mit weniger als 2 Nachbarn
                    if(nachbarn < 2){
                        spielfeld[i][j] = false;
                    }

                    //3. Regel: Bleibt unverändert bei 2 oder 3 Nachbarn
                    if(nachbarn == 2 || nachbarn == 3){
                        //Mache nichts
                    }
                    //4. Regel: Tod durch Ueberbevoelkerung
                    if(nachbarn > 3){
                        spielfeld[i][j] = false;
                    }
                }
            }
            Thread.sleep(500);
            if(beiAenderung != null){
                beiAenderung.aktualisiere(spielfeld);
            }
            schritt++;
        }
    }

    private int zeahleNachbarn(int i, int j){
        int nachbarn = 0;
        //Pruefe oben
        if(istImSpielfeld(i - 1, j - 1)){nachbarn++;}
        if(istImSpielfeld(i, j - 1)){nachbarn++;}
        if(istImSpielfeld(i + 1, j - 1)){nachbarn++;}

        //Pruefe links und rechts
        if(istImSpielfeld(i - 1, j)){nachbarn++;}
        if(istImSpielfeld(i + 1, j)){nachbarn++;}

        //Pruefe unten
        if(istImSpielfeld(i - 1, j + 1)){nachbarn++;}
        if(istImSpielfeld(i, j + 1)){nachbarn++;}
        if(istImSpielfeld(i + 1, j + 1)){nachbarn++;}

        return nachbarn;
    }

    private boolean istImSpielfeld(int i, int j){
        boolean istRaus = false;
        if(i < 0 || j < 0 || i >= spielfeld.length || j >= spielfeld.length){
            istRaus = true;
        }
        if(istRaus){
            return false;
        }
        if(spielfeld[i][j]){
            return true;
        }
        return false;
    }

    @Override
    public void anmeldenFuerAktualisierungBeiAenderung(BeiAenderung beiAenderung){
        this.beiAenderung = beiAenderung;
    }



}
