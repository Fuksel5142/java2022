package Notlar;

public class EngineerManager extends EmployeManager{
    @Override // -> Mühendis çalışanlarına ekstra olarak
    // her zam sonunda +50TL eklenmesini istiyoruz.
    public void makeRaise(double raiseValue){
        super.employeMoney += raiseValue;
        super.employeMoney += 50;
        System.out.println("-> Başarılı Bir Şekilde "+employeName+
                " Çalışanına "+raiseValue +" TL ve Mühendis Olduğu "
                + "İçin +50 TL Zam Yapıldı.\n-> Yeni Maaş: "
                +super.employeMoney +"TL \n----------");
    }
}