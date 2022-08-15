package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {// fırlatabilir

        /*
        Java dan bilgisayarımızdaki bir dosyaya erişmek istiyorsak
        FileİnputStream Claas ından yardım alırız.
        Aynı şekilde Java'dan bilgisayarımızdaki bir dosyaya
        ekleme veya update yapmak istersek
        FileOutoutStream Class indan yardım alırız.
         */
        FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt");
        /*
        Görüldüğü gibi compli time da altını kırmızı çizen her durum
        Compile time error değildir
        Java da bazı exceptionlarda compile time exception dır
        Özellikle dosya okuma ve yazma ile ilgili exceptionlar
        Compile time exceptionlardır

        Compile Time Exception oluştuğunda Java çözüm için 2 ihtimal öneriri
        1- try-catch ile cevrelemek
        2- method signature'ina throws keyword ile beklenen exception turunu yazmak.




        Throes Exception , sadece olayın farkında olduğunun deklarasyonudur
        exception in handle edilmesinde hiçbir rolu yoktur
        yabi try catch ile kontrol altına aldığımız exceptionlarla kod çalışmaya devam ediyordu
        Ancak throws exception yazdığımızda java bir exception ile karşılasırsa
        hiç bir şey yapmamışız gibi hata mesajı yayınlayıp,çalışmayı durdurur
         */


    }

}
