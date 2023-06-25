package p1.miniprojeler;

import java.util.Scanner;

public class Ogrenci {
  private   String isim;
  private   String cinsiyet;
  private   int kilo;
 private    int boy;

 static Scanner input=new Scanner(System.in);


    public Ogrenci(String isim, String cinsiyet, int kilo, int boy) {
        this.isim = isim;
        this.cinsiyet = cinsiyet;
        this.kilo = kilo;
        this.boy = boy;
    }



    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    @Override
    public String toString() {
        return " Ogrenci \n" +
                "isim =" + isim +
                "\ncinsiyet =" + cinsiyet +
                "\nkilo =" + kilo +
                "\nboy =" + boy ;
    }




}
