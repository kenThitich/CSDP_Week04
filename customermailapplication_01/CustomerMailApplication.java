import java.util.Scanner;
public class CustomerMailApplication {
    /**
     * @param args the command line arguments
     */
    private Customer customer;
    public CustomerMailApplication(Customer customer) {
        this.customer = customer;
    }
    public static Customer getCustomerTypeFromUser() {
        Customer cust = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                cust = CustomerMailFactory.createAutomobile("Regular");
                break;
            case 2:
                cust =CustomerMailFactory.createAutomobile("Mountain");
                break;
            case 3:
                cust =CustomerMailFactory.createAutomobile("Delinquent");
                break;
        }
        inp.close();
        return cust;
    }
    public String generateMail() {
        return customer.createMail();
    }
    
    public static void main(String[] args) {
        Customer customer = getCustomerTypeFromUser();
        CustomerMailApplication app = new CustomerMailApplication(customer);
        System.out.println(app.generateMail());        
    }
}
