package Day34_inheritance;

public class Toyota {
    protected String marka="Toyota";
    protected String model="Model belirtilmedi";
    protected String yakit="Yakit belirtilmedi";

    protected void motor(){
        System.out.println("Toyota çevreci motorlar");
    }
    protected void aku(){
        System.out.println("Toyota modele göre aku kullanır");
    }

}
