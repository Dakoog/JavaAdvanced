package company;

import company.Employee;
import company.Manager;
import company.Secretary;

public class CompanyMain {


    public static void main(String[] args) {
        Employee jan = new Employee("Jan", 200);                 // referencja typu Employee może wskazywać na obiekty
        Employee alicja = new Secretary("Alicja", 220);             // które dziedziczą po klasie Employee
        Employee bogdan = new Manager("Bogdan", 250, 50);
        Manager milosz = new Manager("Miłosz", 270);
        Secretary eve = new Secretary("Eve",890);

        // manager, who needs a secretary
        System.out.println();
        System.out.println("\n--- manager, who needs a secretary ---");
        Secretary secretary = (Secretary) alicja; // możemy przypisać ją do referencji typu Secretary
        milosz.makeCall("111-111-111");
        milosz.setSecretary(secretary);
        milosz.makeCall("222-222-222");


        //manager who should talk to employees, motivating them

        System.out.println("\n--- manager who should talk to employees, motivating them ---");
        Manager manager = (Manager) bogdan;
        manager.makeSpeech();
        String managersSpeech = "If you do it on time, you will receive a bonus!";
        manager.makeSpeech(managersSpeech);
        manager.setSecretary(eve);
        manager.makeCall("987 654 321");

        System.out.println("\n--- display information about new employee ---");
        displayInformation(jan);
        displayInformation(milosz);
        displayInformation(secretary);
        displayInformation(bogdan);
    }


    public static void displayInformation(Employee employee) {      // metoda przyjmuje obiekty klasy Employee i wszystkich klas dziedziczących po Employee
        System.out.println();
        System.out.print("This is our new employee ");
        employee.show();                                            // następuje wywołanie metody show() z obiektu odpowiedniego typu
    }                                                               // jeśli obiekt jest klasy Manager to wywoła przesłoniętą metodę
}
