/*
 * Titel: Programmieren 3, AB02
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
 */

package de.hsos.prog3.gbuccell.ab02.logik;

public interface Simulation {

    void berechneAnfangsGeneration(int anzahlZellen, int wahrscheinlichkeitBesiedlung);
    void berechneFolgeGeneration(int berechnungsschritte) throws InterruptedException;
    void anmeldenFuerAktualisierungBeiAenderung(BeiAenderung beiAenderung);

}
