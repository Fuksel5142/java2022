package day26_constructor;

public class Point {
    int x, y;

    Point() {
        x = 0;
        y = 0; // Default Constructor Yapıcı Metot

    }

    Point(int a) { // Tek Parametreli değişken Constructor
        this.x = a;
        this.y = a;
    }

    Point(int a, int b) { // çift Parametreli değişken Constructor
        this.x = a;
        this.y = b;
    }

    String konumYaz() {
        return "X koordinatı" + x + "Y Koordinatı : " + y;

    }
}




