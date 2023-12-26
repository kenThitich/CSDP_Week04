//make this class a subclass of customer
public class DelinquentCustomer extends Customer {
    @Override
    public String createMailAcc() {
        return "Delinquent Customer";
    }   

    @Override
    public IMail createMail(){
        return new DelinquentMail();
    }
    @Override
    public IBrochure createBrochue(){
        return new DelinquentBC();
    }
}
