package day11_stringManipulatıon;

public class C01_indexof {

    public static void main(String[] args) {

        // eğer istediğimiz index den sonrasını kontrol etmek istersek
        // o zaman aynı methodu iki  parametreli olarak kullanabiliriz
        String str="Java ogrenmek cok guzel";


        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf("r"));
        System.out.println(str.indexOf("j"));
        System.out.println(str.indexOf("g",6));// dan itibareen oluypr
        // yukarıdaki str da 2. ve 3. e' nin indexlerini bulun
        // 2. e yi bulabilmek için 1.e nin index ine ihtiyacım var
        int ilke=str.indexOf("e");
        int ikincie= str.indexOf("e",ilke+1);

        if (ikincie==-1){
            System.out.println("ikinci e yok");
        }else{
            int ucuncue=str.indexOf("e",ikincie+1);
                if (ucuncue==-1){
                    System.out.println("verilen str da 3. e yok");
                }else {
                    System.out.println("verilen str da 3. e var");
                }
            }
        }

    }

