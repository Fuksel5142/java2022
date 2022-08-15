package Yazılım_teknolonoji_Akademisi;

public class Otomobil {
     private String renk;
     private String jant;
     private String model="Audi";
     private int en=2;
     private int boy=3;

     public Otomobil() {

     }

     public String getModel() {
          return this.model;
     }

     public void setRenk(String renk) {
          this.renk = renk;
     }

     public String getJant() {
          return this.jant;
     }

     public void setJant(String jant) {
          this.jant = jant;
     }

     public String getRenk() {
          return this.renk;
     }

     public int getEn() {
          return this.en;
     }

     public int getBoy() {
          return this.boy;
     }
}
