package day33_encapsulation;

public class Tasit {
    private String tasitTuru;

    public String getTasitTuru() {
        return tasitTuru;
    }
    // getter metoduda tek bir satırlık işlem yapıyor
    // başka class ların private olduğu için erişemediği
    // taşıt türü bilgisini, class içinden alıp
    // istenen farklı clasllara return ediyor

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
        //return olmadığı icin bu methodun cağırıldığı tasitrunner classinden yazdirilamaz
        //burada bir satırlık islem yapıyor o bir satırlık islemde
        // bizim gönderdiğimiz parametreyi instence variable a atıyor.
    }

    public boolean isMuayenesiVarmi() {
        return muayenesiVarmi;
    }
    // booelan variable lar için oluşturulan getter method

    public void setMuayenesiVarmi(boolean muayenesiVarmi) {
        this.muayenesiVarmi = muayenesiVarmi;
    }

    private boolean muayenesiVarmi;


}
