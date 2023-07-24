package cs655.hw3.part3.FactoryMethod;

public class Boa extends BankFactory {

    @Override
    public Customer createStandardCustomerAC() {
        System.out.println("Creating Standard Customer");
        return new StandardCustomer();
    }

    @Override
    public Customer createPreferredCustomerAC() {
        System.out.println("Creating Preferred Customer");
        return new PreferredCustomer();
    }

    @Override
    public Customer createBusinessCustomerAC() {
        System.out.println("Creating Business Customer");
        return new BusinessCustomer();
    }
}
