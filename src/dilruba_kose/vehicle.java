package dilruba_kose;

public class vehicle implements Engine{

    int numberOfSeats;
    int numberOfWheels;

     public void start(){
        System.out.println("Araç çalışıyor");

    }

    @Override
    public void stop() {
        System.out.println("Araç durdu...");

    }
}
