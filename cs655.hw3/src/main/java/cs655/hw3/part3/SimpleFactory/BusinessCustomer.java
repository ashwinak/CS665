package cs655.hw3.part3.SimpleFactory;

public class BusinessCustomer implements Customer {
    @Override
    public void createCustomerType() {
        System.out.println("**Customer**::BusinessCustomer");

    }
}
