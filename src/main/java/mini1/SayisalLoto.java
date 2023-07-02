package mini1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayisalLoto {
    public static void main(String[] args) {
        /*Sayısal loto uygu
        bilet için rastgele n tane sayı üretilsin
        loto sonucu ratgele n tane sayı ile üretilsin
        sayısal lotoda tekarlı sayılar olmamalı
         n(hane sayısı),sayılar için min ve max değerler kullanıcıdan alınsın

         sonuc ve bilet karşılaştırılsın,kaç eşleşeme oldu kullanıcıya bildirilsin
         */

        lotoNumaralari();

    }

    private static void lotoNumaralari() {
        Scanner input = new Scanner(System.in);
        System.out.println("Loto için bana hane sayısını ver");
        int slots = input.nextInt();
        input.nextLine();

        System.out.println("Sayılar için min değer giriniz");
        int min = input.nextInt();
        input.nextLine();
        System.out.println("Sayılar için max değer giriniz");
        int max = input.nextInt();
        input.nextLine();


        int[] lotoArr = new int[slots];
        int[] myTikcket = new int[slots];


        int randomNumber1 = 0;
        int randomNumber2 = 0;

        Random random = new Random();
        boolean isReleated;

        for (int i = 0; i < slots; i++) {

            do {
                isReleated = false;
                randomNumber1 = random.nextInt(max + 1 - min) + min;
                for (int j = 0; j < slots; j++) {
                    if (lotoArr[j] == randomNumber1) {
                        isReleated = true;
                        break;
                    }
                }
            } while (isReleated);
            lotoArr[i] = randomNumber1;
        }


        for (int i = 0; i < slots; i++) {

            do {
                isReleated = false;
                randomNumber2 = random.nextInt(max + 1 - min) + min;
                for (int j = 0; j < slots; j++) {
                    if (myTikcket[j] == randomNumber2) {
                        isReleated = true;
                        break;
                    }
                }
            } while (isReleated);
            myTikcket[i] = randomNumber2;
        }

        System.out.println(Arrays.toString(lotoArr));
        System.out.println(Arrays.toString(myTikcket));
      int result=  compare(lotoArr,myTikcket);

      if(result==0){
          System.out.println("eşleşen yok kaybettin");
      }else{
          System.out.println("eşleşen sayı "+result+" adet");
      }
    }

    public static int compare(int[] lotoArr, int[] myTicket) {
        int counter=0;
        for (int i = 0; i < lotoArr.length; i++) {
            for (int j = 0; j < myTicket.length; j++) {
if(lotoArr[i]==myTicket[j]){
    counter++;}
            }
        }
 return counter;   }




}
