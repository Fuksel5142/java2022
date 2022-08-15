package dilruba_kose;

public class ObjectFactory {
    public static void main(String[] args) {

        ders9 firstpen=new ders9();
        firstpen.color="Pembe";
        firstpen.height=10;
        String message="İlk kalem üretildi";

        firstpen.writeMessage(message);

        ders9 secondpen=new ders9();
        secondpen.color="Mavi";
        secondpen.height=8;
        secondpen.writeMessage(secondpen.color+ " "+secondpen.height);

        Car car=new Car();
        car.numberOfWheels=5;
        car.numberOfSeats=4;

        Bycle bicyle=new Bycle();
        bicyle.numberOfWheels=1;
        bicyle.numberOfSeats=2;

        vehicle car2=new Car();
        Engine engine=new Car();// egine en üste gibi oluyor//plymorhsm


        car2.stop();

        car.start();
        bicyle.start();
        car2.start();// araba çalışıyor

        vehicle [] vehicles=new vehicle[10];

        vehicles[0]=car;
        vehicles[1]=bicyle;
        vehicles[2]=car2;



    }

}
