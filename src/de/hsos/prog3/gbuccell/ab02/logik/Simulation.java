/*
 * Titel: Programmieren 3, AB02
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
 */

package de.hsos.prog3.gbuccell.ab02.logik;

public interface Simulation {

    void berechneAnfangsGeneration(int anzahlDerZellen, int wahrscheinkeitDerBesiedlung);
    void berechneFolgeGeneration(int berechnungsschritte);
    void anmeldenFuerAktualisierungBeiAenderung(BeiAenderung beiAenderung);

}
