package mini1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectStudent extends Ogrenci {


    public SelectStudent(String isim, String cinsiyet, int kilo, int boy) {
        super(isim, cinsiyet, kilo, boy);
    }

    public static void main(String[] args) {
        List<Ogrenci> ogrenciListesi=new ArrayList<>();
        Scanner input = new Scanner(System.in);





        System.out.println("kaç öğrenci gireceksiniz?");
     int sayi=input.nextInt();
     input.nextLine();

        for (int i = 0; i <sayi ; i++) {
            System.out.println("ogrenci ismi giriniz");
          String isim = input.next();
            System.out.println("ogrenci cinsiyetini giriniz");
            String cinsiyet = input.next();
            System.out.println("ogrenci kilosunu giriniz");
            int kilo = input.nextInt();
            System.out.println("ogrenci boyunu giriniz");
            int boy = input.nextInt();

            ogrenciListesi.add(new Ogrenci(isim,cinsiyet,kilo,boy));
        }


        System.out.printf("%-10s\t%-10s\t%-10s\t%-10s%n", "Adı", "Cinsiyeti", "Kilosu", "Boyu");
        for (int i = 0; i <sayi ; i++) {
            System.out.printf("%-10s,%-10s,%-10s,%-10s", ogrenciListesi.get(i).getIsim(), ogrenciListesi.get(i).getCinsiyet(),ogrenciListesi.get(i).getKilo(),ogrenciListesi.get(i).getBoy());
        }

ogrenciSec(ogrenciListesi);


    }
public static void ogrenciSec(List<Ogrenci> ogrenciListesi){
        ArrayList<Ogrenci> secilenOgrenciler=new ArrayList<>();
        int sayac=0;
        for(Ogrenci w:ogrenciListesi){
            if(w.getCinsiyet().equalsIgnoreCase("erkek")&&w.getBoy()>=160 && w.getKilo()>=60&&w.getKilo()<=90){
                    secilenOgrenciler.add(w);
                    sayac++;
                }else if(w.getCinsiyet().equalsIgnoreCase("kız")&&w.getBoy()>150&&w.getKilo()>50 &&w.getKilo()<70){
                secilenOgrenciler.add(w);
                sayac++;
            }
        }
    System.out.println("***SEÇİLEN ÖĞRENCİLER***");
    System.out.printf("%-10s\t%-10s\t%-10s\t%-10s%n", "Adı", "Cinsiyeti", "Kilosu", "Boyu");
    for (int i = 0; i <sayac ; i++) {
        System.out.printf("%-10s,%-10s,%-10s,%-10s", secilenOgrenciler.get(i).getIsim(), secilenOgrenciler.get(i).getCinsiyet(),secilenOgrenciler.get(i).getKilo(),secilenOgrenciler.get(i).getBoy());
    }
}



}









