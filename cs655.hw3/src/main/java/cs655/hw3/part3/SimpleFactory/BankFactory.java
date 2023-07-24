package cs655.hw3.part3.SimpleFactory;

public  class BankFactory {
    public void createCustomer() {
        Customer custSTD = createStandardCustomerAC();
        custSTD.createCustomerType();

        Customer custPref = createPreferredCustomerAC();
        custPref.createCustomerType();

        Customer custBus = createBusinessCustomerAC();
        custBus.createCustomerType();
    }

    public Customer createStandardCustomerAC() {
        System.out.println("Creating Standard Customer...");
        return new StandardCustomer();
    }

    public Customer createPreferredCustomerAC() {
        System.out.println("Creating Preferred Customer...");
        return new PreferredCustomer();
    }

    public Customer createBusinessCustomerAC() {
        System.out.println("Creating Business Customer...");
        return new BusinessCustomer();
    }

}
