package cs655.hw3.part3.FactoryMethod;

public class BusinessCustomer implements Customer {
    @Override
    public void createCustomerType() {
        System.out.println("**Customer**::BusinessCustomer");

    }
}
