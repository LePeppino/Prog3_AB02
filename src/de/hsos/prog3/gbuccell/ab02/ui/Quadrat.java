package de.hsos.prog3.gbuccell.ab02.ui;

import de.hsos.prog3.gbuccell.ab02.util.Interaktionsbrett;

public class Quadrat {

    private int x;
    private int y;
    private int seitenlaenge;

    public Quadrat(int x, int y, int seitenlaenge){
        setX(x);
        setY(y);
        setSeitenlaenge(seitenlaenge);
    }
    private void setX(int x){
        if(x >= 1) {
            this.x = x;
        } else{
            this.x = 0;
        }
    }
    private void setY(int y){
        if(y >= 1) {
            this.y = y;
        } else{
            this.y = 0;
        }
    }
    private void setSeitenlaenge(int seitenlaenge){
        if(seitenlaenge >= 1){
            this.seitenlaenge = seitenlaenge;
        } else{
            this.seitenlaenge = 0;
        }
    }

    public void darstellenRahmen(Interaktionsbrett ib){
        ib.neuesRechteck(x, y, seitenlaenge, seitenlaenge);
    }
    public void darstellenFuellung(Interaktionsbrett ib){
        ib.neuesRechteck(x, y, seitenlaenge, seitenlaenge);
        for(int i = y + 1; i < y + seitenlaenge; i++){
            ib.neueLinie(x, i, x + seitenlaenge, i);
        }
    }
}
