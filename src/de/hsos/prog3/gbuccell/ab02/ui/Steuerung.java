/*
 * Titel: Programmieren 3, AB02
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
 */

package de.hsos.prog3.gbuccell.ab02.ui;

import de.hsos.prog3.gbuccell.ab02.logik.BeiAenderung;
import de.hsos.prog3.gbuccell.ab02.logik.Simulator;
import de.hsos.prog3.gbuccell.ab02.util.EinUndAusgabe;
import de.hsos.prog3.gbuccell.ab02.util.Interaktionsbrett;

public class Steuerung implements BeiAenderung {

    public NutzerEingabe nutzerEingabe;
    public Simulator simulator;
    public SpielfeldDarstellung spielfeldDarstellung;

    public void startDesSpiels(){
        initialisierung();
        int anzahlZellen = nutzerEingabe.anzahlZellenDesSpielfelds();
        int wahrscheinlichkeit = nutzerEingabe.wahrscheinlichkeitDerBesiedlung();
        simulator.berechneAnfangsGeneration(anzahlZellen, wahrscheinlichkeit);

    }

    private void initialisierung(){
        Interaktionsbrett ib = new Interaktionsbrett();
        EinUndAusgabe io = new EinUndAusgabe();
        nutzerEingabe = new NutzerEingabe(io);
        spielfeldDarstellung = new SpielfeldDarstellung(ib);
    }

    @Override
    public void aktualisiere(boolean[][] neu){
        spielfeldDarstellung.spielfeldDarstellen(neu);
    }
}
