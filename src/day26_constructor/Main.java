package day26_constructor;

public class Main {
    public static void main(String[] args) {
        //Nesne Oluşturma:
        UserManager userManager=new UserManager();
        //Nesne İçerisindeki Özelliklere Veri Ekleme:
        userManager.userName= "Emre";
        userManager.userSurName="Celen";
        userManager.dateOfBirth= 1985;
        // ekrana yazdırma işlemi
        System.out.println("Kullanıcı Bilgileri\n-----------\nAdınız: " +
                ""+userManager.writeName()+"\nSoyadınız: "+userManager.userSurName+"\nYaşınız: " +
                ""+userManager.writeAge()+"\n-----------");




    }
}
