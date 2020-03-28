/*
 * Titel: Programmieren 3, AB02
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
 */

package de.hsos.prog3.gbuccell.ab02.ui;

import de.hsos.prog3.gbuccell.ab02.logik.Simulator;
import de.hsos.prog3.gbuccell.ab02.util.Interaktionsbrett;

public class SpielfeldDarstellung {

    Interaktionsbrett ib;
    static int SEITENLAENGE = 300;
    static int MARGIN = 30;

    public SpielfeldDarstellung(Interaktionsbrett ib){
        this.ib = ib;
    }

    public void spielfeldDarstellen(boolean[][] spielfeld){
        int x = MARGIN;
        int y = MARGIN;
        int seitenlaenge = SEITENLAENGE/spielfeld.length;
        for(int i = 0; i < spielfeld.length; i++){
            for(int j = 0; j < spielfeld[i].length; j++){
                Quadrat q = new Quadrat(x, y, seitenlaenge);
                if(spielfeld[i][j]){
                    q.darstellenFuellung(ib);
                } else{
                    q.darstellenRahmen(ib);
                }
                x += seitenlaenge;
            }
            x = MARGIN;
            y += seitenlaenge;
        }
    }

    public void abwischen(){
        ib.abwischen();
    }
}
