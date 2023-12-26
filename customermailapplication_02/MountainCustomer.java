//make this class a subclass of customer
public class MountainCustomer extends Customer {
    @Override
    public String createMailAcc() {
        return "Mountain Customer";
    }
    @Override
    public IMail createMail(){
        return new MountainMail();
    }
    @Override
    public IBrochure createBrochue(){
        return new MountainBC();
    }
}
