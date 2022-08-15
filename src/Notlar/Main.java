package Notlar;

public class Main {
    public static void main(String[] args) {
        EmployeManager employeManager = new EmployeManager();
        employeManager.addEmploye("Metehan",
                "Durmuş","Beden İşçisi",4000);
        System.out.println(employeManager.getEmployeInfo());
        employeManager.makeRaise(500);
        EngineerManager engineerManager = new EngineerManager();
        engineerManager.addEmploye("Oktay",
                "Güden",
                "Elektrik Elektronik Mühendisi",7500);
        System.out.println(engineerManager.getEmployeInfo());
        engineerManager.makeRaise(500);
    }
}
