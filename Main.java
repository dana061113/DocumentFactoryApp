import creators.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Құжат түрін таңдаңыз:");
        System.out.println("1 - Report");
        System.out.println("2 - Resume");
        System.out.println("3 - Letter");
        System.out.println("4 - Invoice");

        int choice = sc.nextInt();

        DocumentCreator creator = null;

        switch (choice) {
            case 1:
                creator = new ReportCreator();
                break;
            case 2:
                creator = new ResumeCreator();
                break;
            case 3:
                creator = new LetterCreator();
                break;
            case 4:
                creator = new InvoiceCreator();
                break;
            default:
                System.out.println("Қате таңдау!");
        }

        if (creator != null) {
            creator.openDocument();
        }
    }
}
