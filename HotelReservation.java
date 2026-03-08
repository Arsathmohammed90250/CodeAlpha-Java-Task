
import java.util.Scanner;

public class HotelReservation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Hotel Reservation System");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Select Room Type:");
        System.out.println("1. Standard Room");
        System.out.println("2. Deluxe Room");
        System.out.println("3. Suite Room");

        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        if(choice == 1) {
            System.out.println("Standard Room booked successfully for " + name);
        }
        else if(choice == 2) {
            System.out.println("Deluxe Room booked successfully for " + name);
        }
        else if(choice == 3) {
            System.out.println("Suite Room booked successfully for " + name);
        }
        else {
            System.out.println("Invalid choice!");
        }

        System.out.println("Thank you for using our reservation system.");
    }
}