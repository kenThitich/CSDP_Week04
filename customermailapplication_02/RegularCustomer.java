//make this class a subclass of customer
public class RegularCustomer extends Customer {

    @Override
    public String createMailAcc() {
        return "Regular Customer";
    }
    @Override
    public IMail createMail(){
        return new RegularMail();
    }
    @Override
    public IBrochure createBrochue(){
        return new RegularBC();
    }
}
