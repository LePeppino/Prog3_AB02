package de.hsos.prog3.gbuccell.ab02;

import de.hsos.prog3.gbuccell.ab02.logik.Simulator;
import de.hsos.prog3.gbuccell.ab02.ui.NutzerEingabe;
import de.hsos.prog3.gbuccell.ab02.util.*;

public class Main {

    public static void main(String[] args) {

        NutzerEingabe eingabe = new NutzerEingabe(new EinUndAusgabe());
        //Interaktionsbrett ib = new Interaktionsbrett();
        Simulator simulator = new Simulator();

        int spielfeld = eingabe.anzahlZellenDesSpielfelds();
        int wahrscheinlichkeit = eingabe.wahrscheinlichkeitDerBesiedlung();
        int simulSchritte = eingabe.anzahlDerSimulationsschritte();

        simulator.berechneAnfangsGeneration(spielfeld, wahrscheinlichkeit);

    }
}
