package nguyen.customer;

/**
 * Created by Ken Nguyen and Jimmy Nguyen on 2/3/2016.
 */
import java.util.Scanner;
public class CustomerApp {
    public static void main(String args[]) {
        // display welcome message and prompt
        System.out.println("Welcome to the Customer Database");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter a customer number: ");
            String customerNumber = sc.nextLine();
            Customer customer = CustomerDB.getCustomer(customerNumber);
            if(customer == null) {
                System.out.println("There is no customer number " + customerNumber + " in our records.");
            } else {
                String message = customerNumber + "\n" +
                        customer.getName() + "\n" +
                        customer.getAddress() + "\n" +
                        customer.getCity() + ", " + customer.getState() + " " +
                        customer.getPostalCode();
                System.out.println(message);
            }
            System.out.print("Display another customer? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }
}
