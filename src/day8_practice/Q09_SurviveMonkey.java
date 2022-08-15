package day8_practice;

public class Q09_SurviveMonkey {
    /*
        There is a lonely monkey in the island
        He needs to eat 4 bananas every day
        there are just 165 bananas in that island
        Create following variables and find how many days
        monkey can survive.
        Use do while loop, increment and decrement and if statements
        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;
        */
    public static void main(String[] args) {
        int numberOfBananas = 165;
        int survivalDays = 1;
        boolean monkeyAlive = true;
        do {
            System.out.println("Maymunlar günde 4 muz yer");
            numberOfBananas-=4;
            survivalDays++;
            if (numberOfBananas<4){
                monkeyAlive = false;
                System.out.println("bugün "+survivalDays+" .gun muz kalmadı,maynın sizlere ömür");
            }else{
                System.out.println("bugün "+survivalDays+" .gun maymın halen hayatta"+" "+ numberOfBananas+" "+ "muz kaldı");
            }



        }while (monkeyAlive);// false oldumu durur
        System.out.println("toplam yasadigi gun sayisi : " + (survivalDays-1));

    }
}
