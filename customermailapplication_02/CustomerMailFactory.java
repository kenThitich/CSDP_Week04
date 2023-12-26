public class CustomerMailFactory{
	public static Customer createAutomobile(String type) {
		if (type.equals("Regular")) 
			return new RegularCustomer();
		else if (type.equals("Mountain"))
			return new MountainCustomer();
        else if (type.equals("Delinquent"))
            return new DelinquentCustomer();
		return null;
	}

}
