package day26_constructor;

public class Kamyon {
    public String marka="Marka belirtilmedi";
    public String model="Model Belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(String marka, String model, int yil, int fiyat ){
        /*
        burası scope eşitliğin sağı
        variable solu değer
        bizim gtemel amacımız Kmayon runner da arrgüment olarak girilen değerin
        kamyon classında instance variable a atanması
        ancak scope konusunda öğrndiğimşz gibi kamyon constructorı  scope ında
        marka olduğu için instance marka ya  gitmiyor

        isimler aynı ise bu karılıklığı gidermek için instance variable ları
        belirli hale getirmemiz lazım java bunun için this keywordu oluşturmuştur

        Genel kullanım açısından this keywordu kodu herkesin anlamasını kolaylaştırdığı
        için tercih edilir

         */
        this.marka=marka; // başındaki this bu clasın markası demektir eşitliğn
        // sağ tarafındaki parametre olan değer
        this.model=model; //
        this.yil=yil;
        this.fiyat=fiyat;

    }
public Kamyon(){



}


    @Override
    public String toString() {
        return
                "\nmarka=" + marka + '\'' +
                "\nmodel=" + model + '\'' +
                "\nyil=" + yil +
                "\nfiyat=" + fiyat
                ;
    }
}
