package miniprojeler;

import java.util.Scanner;

public class Ogrenci1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kaç tane öğrenci gireceksiniz?");
        int sayi = input.nextInt();
        String[] ogrenciAdi = new String[sayi];
        String[] ogrenciCinsiyet = new String[sayi];
        Integer[] ogrenciBoyu = new Integer[sayi];
        Integer[] ogrenciKilosu = new Integer[sayi];
        input.nextLine();

        for (int i = 0; i < sayi; i++) {
            System.out.println("öğrenci adını giriniz");
            String ad = input.nextLine();

            boolean isSuccesful = false;

            System.out.println("öğrenci cinsiyet giriniz");
            String cinsiyet = input.nextLine().toUpperCase().substring(0, 1);

            do {
                if (!cinsiyet.equals("E" ) && !cinsiyet.equals("K")) {
                    System.out.println("Lütfen geçerli bir giriş yapınız");
                    cinsiyet = input.nextLine().toUpperCase().substring(0, 1);
                } else {
                    isSuccesful = true;
                }
            } while (!isSuccesful);



            System.out.println("öğrenci boyu giriniz");
                int boy = input.nextInt();
                input.nextLine();

                System.out.println("öğrenci kilosu giriniz");
                int kilo = input.nextInt();
                input.nextLine();

                ogrenciAdi[i] = ad;
                ogrenciCinsiyet[i] = cinsiyet;
                ogrenciBoyu[i] = boy;
                ogrenciKilosu[i] = kilo;
            }

            System.out.println("***SEÇİLEN ÖĞRENCİLER***");
            for (int i = 0; i < sayi; i++) {
                if (ogrenciCinsiyet[i].equals("E") && ogrenciBoyu[i] >= 160 && ogrenciKilosu[i] >= 60 && ogrenciKilosu[i] <= 90) {
                    System.out.println(ogrenciAdi[i] + "\t" + ogrenciCinsiyet[i] + "\t" + ogrenciBoyu[i] + "\t" + ogrenciKilosu[i]);
                } else if (ogrenciCinsiyet[i].equals("K") && ogrenciBoyu[i] >= 150 && ogrenciKilosu[i] >= 50 && ogrenciKilosu[i] <= 70) {
                    System.out.println(ogrenciAdi[i] + "\t" + ogrenciCinsiyet[i] + "\t" + ogrenciBoyu[i] + "\t" + ogrenciKilosu[i]);
                }


            }
        }
    }

