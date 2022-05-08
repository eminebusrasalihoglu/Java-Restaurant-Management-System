/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

/**
 *
 * @author Emine Busra Salihoglu
 */
public class Beverages extends Menu{
    private int ml;
    public Beverages(double price, String name, int ml) {

        super(price, name);
        this.ml=ml;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }
}
