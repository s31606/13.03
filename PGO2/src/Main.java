import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the city of residence: ");
        String city = scanner.next();

        System.out.println("Enter the age: ");
        int age = scanner.nextInt();

        String date = LocalDate.now().getDayOfWeek().name();

        double ticketPrice = 40;
        int discount = 0;

        if (age < 10) {
            discount = 100;
        } else if (age >= 10 && age <= 18) {
            discount += 50;
        }

        if (city.equals("Warsaw")) {
            discount += 10;
        }

        if (date.equals("THURSDAY")) {
            discount = 100;
        }

        ticketPrice -= (ticketPrice * discount * 0.01);

        System.out.println("Data: " + city + ", " + age + " years old, " + date + " Ticket price: " + ticketPrice +
                " PLN " + "Discount: " + discount + " %");
    }
}