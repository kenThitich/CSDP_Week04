import java.util.Scanner;
public class CustomerMailApplication {
    /**
     * @param args the command line arguments
     */
    private static Customer customer;
    private static CustomerMailApplication custApp;

    private CustomerMailApplication() {
        setCustomerTypeFromUser();
    }

	public static CustomerMailApplication getCustApp() {
			if (custApp == null) {
				custApp = new CustomerMailApplication();
            }
            return custApp;
	}

    public static void setCustomerTypeFromUser() {
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
        customer = cust;
    }

    public Customer getCust(){
        return customer;
    }

    public void generateMailAndBC() {
        IMail mail = customer.createMail();
        IBrochure bc = customer.createBrochue(); 
        displayMailAndBC(mail, bc);
    }

    public void displayMailAndBC(IMail mail, IBrochure bc){
        System.out.println(mail.sendMail());
        System.out.println(bc.sendBrochure());
    }

    
    public static void main(String[] args) {
        CustomerMailApplication app = getCustApp();    
        app.generateMailAndBC();
        app.setCustomerTypeFromUser();
        app.generateMailAndBC();
    }
}
