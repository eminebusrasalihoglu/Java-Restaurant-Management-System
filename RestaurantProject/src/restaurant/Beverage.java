/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author Busra
 */
public class Beverage extends Menu{// Beverage sinifi menuden extends edilir
    private int ml;
    public Beverage(double fiyat, String isim,int ml) {

        super(fiyat, isim);//menuden fiyat ve ismi alinir
        this.ml=ml;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }
}
