package enes_bayram;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Calısan sınıfını oluşturup işe başlayalım
        System.out.println("*******Uygulamaya Hoşgeldiniz********");
       Scanner scanner = new Scanner(System.in);
        System.out.println("No değerini giriniz :");
        int no= scanner.nextInt();

        System.out.println("İsim değerini giriniz :");
        String isim= scanner.nextLine();
        scanner.nextLine();// int den sonra stringe koy

        System.out.println("Soyisim değerini giriniz :");
        String soyisim= scanner.nextLine();

        System.out.println("tecrübe değerini giriniz :");
        int tecrübe= scanner.nextInt();

        System.out.println("maas değerini giriniz :");
         double maas= scanner.nextDouble();
        scanner.nextLine();

        Calisan calısan= new Calisan(no,isim,soyisim,tecrübe,maas);
        String islemler="1-Çalışan bilgilerini göster\n"
                +"2- Zam yap\n"
                +"3-Format at";
        System.out.println("-------------------------");
        System.out.println(islemler);
        System.out.println("Seçim yapınız: ");
        int seçim=scanner.nextInt();
        scanner.nextLine();
        switch (seçim) {
            case 1:
                calısan.calisanBilgileriGoster();
                break;
                case 2:
                    System.out.println("Zam değerini giriniz :");
                    int zamDegeri=scanner.nextInt();
                    calısan.zamyap(zamDegeri);
                    break;
                    case 3:
                        System.out.println("Kim Format atacak :");
                        scanner.nextLine();
                        String kisi=scanner.nextLine();
                        System.out.println("İşletim sistemini yazınız ");
                        String İsletimSistemi=scanner.nextLine();
                        calısan.formatAt(İsletimSistemi,kisi);

                default:
                    System.out.println("Lütfen belirtilen aralıkta değer giriniz");
                    break;

        }

    }
}
