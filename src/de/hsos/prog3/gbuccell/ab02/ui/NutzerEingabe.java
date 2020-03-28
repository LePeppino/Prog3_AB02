/*
 * Titel: Programmieren 3, AB02
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
 */

package de.hsos.prog3.gbuccell.ab02.ui;

import de.hsos.prog3.gbuccell.ab02.util.EinUndAusgabe;

public class NutzerEingabe {

    private EinUndAusgabe io = new EinUndAusgabe(); //niemals null?

    public NutzerEingabe(EinUndAusgabe io){
        this.io = io;
    }

    public int anzahlZellenDesSpielfelds(){
        System.out.print("Bitte Anzahl der Zellen eingeben (min. 100, max. 1000): ");
        int anzahlZellen = io.leseInteger();
        if(anzahlZellen >= 100 && anzahlZellen <= 1000){
            return anzahlZellen;
        }
        System.out.println("Keine gueltige Zahl!");
        anzahlZellenDesSpielfelds();
        return 0;
    }

    public int wahrscheinlichkeitDerBesiedlung(){
        System.out.print("Wahrscheinlichkeit der Besiedlung eingeben (min. 1, max. 100): ");
        int wahrscheinlichkeit = io.leseInteger();
        if(wahrscheinlichkeit >= 1 && wahrscheinlichkeit <= 100){
            return wahrscheinlichkeit;
        }
        System.out.println("Kein gueltiger Wert!");
        wahrscheinlichkeitDerBesiedlung();
        return 0;
    }

    public int anzahlDerSimulationsschritte(){
        System.out.print("Anzahl der zu simulierenden Schritte eingeben (min. 1, max. 50): ");
        int schritte = io.leseInteger();
        if(schritte >= 1 && schritte <= 50){
            return schritte;
        }
        System.out.println("Keine gueltige Anzahl!");
        anzahlDerSimulationsschritte();
        return 0;
    }


}
