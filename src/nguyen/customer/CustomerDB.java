package nguyen.customer;

/**
 * Created by Ken Nguyen and Jimmy Nguyen on 2/3/2016.
 */
public class CustomerDB {
    public static Customer getCustomer(String customerNumber) {
        Customer customer = new Customer();
        customer.setCustomerNumber(customerNumber);
        if (customer.getCustomerNumber().equals("1001")) {
            customer.setAddress("3400 Richmond Parkway #3423");
            customer.setCity("Bristol");
            customer.setName("Barbara White");
            customer.setPostalCode("06010");
            customer.setState("CT");
        }
        else if (customer.getCustomerNumber().equals("1002")) {
            customer.setAddress("327 Franklin Street");
            customer.setCity("Edina");
            customer.setName("Karl Vang");
            customer.setPostalCode("55435");
            customer.setState("MN");
        }
        else if (customer.getCustomerNumber().equals("1003")) {
            customer.setAddress("518 Commanche Dr.");
            customer.setCity("Greensboro");
            customer.setName("Ronda Chavan");
            customer.setPostalCode("27410");
            customer.setState("NC");
        } else {
            return null;
        }
        return customer;
    }
}
