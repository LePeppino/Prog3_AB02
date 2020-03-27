package de.hsos.prog3.gbuccell.ab02.logik;

public interface Simulation {

    void berechneAnfangsGeneration(int anzahlDerZellen, int wahrscheinkeitDerBesiedlung);
    void berechneFolgeGeneration(int berechnungsschritte);
    void anmeldenFuerAktualisierungBeiAenderung(BeiAenderung beiAenderung);

}
