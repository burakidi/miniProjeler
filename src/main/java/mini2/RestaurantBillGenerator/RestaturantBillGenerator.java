package mini2.RestaurantBillGenerator;

import java.util.Scanner;

public class RestaturantBillGenerator {
    public static void main(String[] args) {

    }

    private static void start() {
    }

    public static void getSelectionMenu(){
        int select=-1;
        while(select!=0){
            Scanner input=new Scanner(System.in);
            System.out.println("-------------------------------------------------------");
            System.out.println("****Lezzet Restaturant Sipariş Uygulaması****");
            System.out.println("1-Menü");
            System.out.println("2-Sipariş gir");
            System.out.println("3-Sipariş iptal etme");
            System.out.println("4-Hesap oluştur");
            System.out.println("0-Çıkış");
            System.out.println("Seçimiz nedir?");
            select= input.nextInt();
            System.out.println("-------------------------------------------------------");
            switch (select){
                case 1:
                    //menüyü listele
                    break;
                    case 2:
                        //Sipariş gir
                    break;
                    case 3:
                    break;
                    case 4:
                    break;
                    case 0:
                    break;
                default:
                    System.out.println("Hatalı giriş");
            }
        }
        System.out.println("iyi günler dileriz...");
    }
}
