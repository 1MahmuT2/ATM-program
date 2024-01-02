import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        System.out.println("------------------------");
        String islemler= "1. İşlem: Bakiye öğrenme.\n"
                          +"2. İşlem: Para çekme.\n"
                          +"3. işlem: Para yatırma.\n"
                          +"Programdan çıkmak için 'q' harfine basınız.";
       
        int bakiye = 1000;

        while(true){
                    System.out.println("------------------------");

            System.out.println(islemler);
            System.out.print("İşlem seçiniz: ");

            
            Scanner input= new Scanner(System.in);
            String islem;
            islem= input.nextLine();
            


           if(islem.equals("q")){
            System.out.println("Programdan çıkış yapılıyor...");
            System.out.println("Çıkış başarılı.");
            break;
           }else if(islem.equals("1")){
            System.out.println("İşlem gerçekleştiriliyor lütfen bekleyiniz.");
            System.out.println("Bakiyeniz: "+bakiye);
            System.out.print("Ana menüye dönmek için 'L' basın: ");
                        String islem1 = input.nextLine();
           
            if (islem1.equals("L")){
                System.out.println("Ana menüye dönülüyor...");
                
            }else{
                System.out.println("Geçersiz karakter Sistem güvenliği sebebi ile sistemden çıkılıyor...");
                break;
            }


           }else if(islem.equals("2")){
            int tutar;
            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
            tutar= input.nextInt();
            if(tutar<bakiye){
                bakiye-=tutar;
                System.out.println("İşlem başarılı kalan bakiyeniz: "+ bakiye);
            }else{
                System.out.println("Yetersiz bakiye.");
            }
            
           }else if(islem.equals("3")){
            int tutar;
            System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
            tutar = input.nextInt();
            bakiye+=tutar;

            System.out.println("İşlem sonu bakiyeniz: "+ bakiye);

           }

            }
        }
    }

