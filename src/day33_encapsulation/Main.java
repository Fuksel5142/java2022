package day33_encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Ekrana Yazdırma Sınıfını Tanımlama:
        Scanner scanner = new Scanner(System.in);
        // dataBaseManager Sınıfının Tanımlanması:
        dataBaseManager dataBaseManager = new dataBaseManager();
        // Değişken Tanımlaması:
        String kullaniciAdi,dbName,dbPass;
        // Ekrana Yazdırma İşlemleri: kısayol için
        System.out.print("Merhaba!\nLütfen Kullanıcı Adını Girin: ");
        kullaniciAdi = scanner.nextLine();
        System.out.print("-----------------------\n-> Database İsmini Girin: ");
        dbName = scanner.nextLine();
        System.out.print("-> Database Şifresini Girin: ");
        dbPass = scanner.nextLine();
        if(dataBaseManager.getDbName().equals(dbName) && dataBaseManager.getDbPass().equals(dbPass)){
            dataBaseManager.setUserName(kullaniciAdi);
            dataBaseManager.dbLog();
        }
        else{
            System.out.print("\n-----------------------\n-> Hatalı Giriş Gerçekleştirdiniz.\n-----------------------");
        }
    }
}
