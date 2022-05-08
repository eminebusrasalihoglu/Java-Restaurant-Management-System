
package restaurant;

/**
 *
 * @author Emine Busra Salihoglu
 */
import java.util.ArrayList;

public class Menu{
    private double fiyat;
    private String isim;
    ArrayList<Food> yemek_list= new ArrayList<Food>();
    ArrayList<Beverage> icecek_list= new ArrayList<Beverage>();

    public Menu(){//default constructor olusturuldu
        this(0,"bilgi yok");
    }
    public Menu(double fiyat,String isim){//constructor olusturuldu

        this.fiyat=fiyat;
        this.isim=isim;
    }
     void yemekAdd(Food a){//arrayliste yemek nesneleri eklenir
        yemek_list.add(a);
    }

    void icecekAdd(Beverage a){//arrayliste icecek nesneleri eklenir
        icecek_list.add(a);
    }



    public void menu_show(){//menudeki yemekler ve icecekler gosterilir
        System.out.println("   YEMEKLER   ");
        for(int i=0;i<yemek_list.size();i++){
            System.out.println((i+1)+") "+yemek_list.get(i).getAlan()+" "+yemek_list.get(i).getIsim()+" fiyat "+yemek_list.get(i).getFiyat());
        }
        System.out.println("   ICECEKLER ");
        for(int i=yemek_list.size();i<(icecek_list.size()+yemek_list.size());i++){
            System.out.println((i+1)+") "+icecek_list.get(i-yemek_list.size()).getIsim()+" fiyat "+icecek_list.get(i-yemek_list.size()).getFiyat()+"-->"+icecek_list.get(i-yemek_list.size()).getMl()+" ml");
        }
    }





    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
}
