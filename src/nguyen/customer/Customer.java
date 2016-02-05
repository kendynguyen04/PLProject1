package nguyen.customer;

/**
 * Created by Ken Nguyen and Jimmy Nguyen on 2/3/2016.
 */
public class Customer {

    // the instance variables
    private String name;
    private String address;
    private String city;
    private String state;
    private String postalCode;
    private String customerNumber;

    // the constructor
    public Customer() {
        name = "";
        address = "";
        city = "";
        state = "";
        postalCode = "";
        customerNumber = "";
    }
    // the set and get methods to modify customer data
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
    public String getCustomerNumber() {
        return customerNumber;
    }
}
