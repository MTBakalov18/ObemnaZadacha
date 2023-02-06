import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        ArrayList<Medicine> medicaments = new ArrayList<>();
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Insert data");
            System.out.println("2. Print data");
            System.out.print("Choose: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    insertData(medicaments);
                    break;
                case 2:
                    printAllData(medicaments);
                    break;

                default:
                    System.out.println(":(");
            }
        }
    }

    public static void insertData(ArrayList<Medicine> medicaments) {

        Scanner scanner = new Scanner(System.in);
        Medicine Medicament = new Medicine();

        String name;
        double price;
        String expirationdate;


        System.out.println();
        System.out.println("Enter the medicine info");
        System.out.print("Name: ");
        name = scanner.nextLine();
        Medicament.setName(name);
        System.out.print("price: ");
        price = scanner.nextDouble();
        Medicament.setPrice(price);
        System.out.println("Enter expiration date: ");
        expirationdate = scanner.nextLine();
        Medicament.setExpirationdate(expirationdate);
        medicaments.add(Medicament);
    }

    public static void printAllData(ArrayList<Medicine> medicaments) {
        for (Medicine m : medicaments) {
            System.out.println(m.toString());
        }
    }

}
