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
        }
        this.x = 0;
    }
    private void setY(int y){
        if(y >= 1) {
            this.y = y;
        }
        this.y = 0;
    }
    private void setSeitenlaenge(int seitenlaenge){
        if(seitenlaenge >= 1){
            this.seitenlaenge = seitenlaenge;
        }
        this.seitenlaenge = 0;
    }

    public void darstellenRahmen(Interaktionsbrett io){
        io.neuesRechteck(x, y, seitenlaenge, seitenlaenge);
    }
    public void darstellenFuellung(Interaktionsbrett io){
        io.neuesRechteck(x, y, seitenlaenge, seitenlaenge);
        for(int i = x; i < x + seitenlaenge; i++){
            io.neueLinie(x, y, x, y + seitenlaenge);
        }
    }
}
