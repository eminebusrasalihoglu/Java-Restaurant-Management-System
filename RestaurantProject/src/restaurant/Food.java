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
import java.util.ArrayList;
import java.util.Arrays;

public class Food extends Menu{//Menu extends edilir
    private String alan;
    public Food(double fiyat, String isim,String alan) {
        super(fiyat, isim);
        this.alan=alan;
    }

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }
}
