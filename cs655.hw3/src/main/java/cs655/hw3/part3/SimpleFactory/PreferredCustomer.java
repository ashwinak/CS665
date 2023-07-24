package cs655.hw3.part3.SimpleFactory;

public class PreferredCustomer implements Customer {
    @Override
    public void createCustomerType() {
        System.out.println("**Customer**::PreferredCustomer");

    }
}
