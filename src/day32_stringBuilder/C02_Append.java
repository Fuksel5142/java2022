package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java daha ne yapsın");

        sb.append("?");

        System.out.println(sb);//Java daha ne yapsın?

        // append istedğimiz String i en sona ekler
        sb.insert(4," her seyi dusunmus,");
        System.out.println(sb);//Java her seyi dusunmus, daha ne yapsın?

        sb.insert(22,"Valla valla",5,11);
        System.out.println(sb);//Java her seyi dusunmus valla, daha ne yapsın?
        // araya ekleme yapmak istedğimizde append değil insert kullanmalıyız

}}
