package Notlar;

public class EmployeManager {
    // Değişken Tanımlaması:
    String employeName, employeSurName,employeJob;
    double employeMoney;
    // Metotların Tanımlanması:
    public void addEmploye(String employeName,String employeSurName,
                           String employeJob, double employeMoney){
        this.employeName = employeName;
        this.employeSurName = employeSurName;
        this.employeJob = employeJob;
        this.employeMoney = employeMoney;
    }
    public String getEmployeInfo() {
        if (employeName != null && employeSurName != null && employeJob != null) {
            if (employeMoney <= 0)
                employeMoney = 0;
            return "----------\n< Çalışan Bilgileri >\n----------"
                    + "\n-> Çalışanın İsmi: "
                    + employeName + "\n-> Çalışanın Soyismi: "
                    + employeSurName + "\n-> Çalışanın İşi: "
                    + employeJob +
                    "\n-> Çalışanın Aldığı Maaş: " + employeMoney
                    + " TL\n----------";
        }
        return "----------\n< Çalışan Bulunamadı veya Mevcut Değil >"
                + "\n----------" +
                "\n-> Sistem üzerinde aratmış olduğunuz " +
                "kullanıcı bilgileri tanımlı değil.\n----------";
    }
    public void makeRaise(double raiseValue){
        this.employeMoney += raiseValue;
        System.out.println("-> Başarılı Bir Şekilde "
                +employeName+" Çalışanına "+raiseValue +
                " TL Zam Yapıldı.\n-> Yeni Maaş: "
                +employeMoney +"TL\n----------");
    }
}
