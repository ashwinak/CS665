package cs655.hw4.part3;

public class App {

    /**
     *
     * @param args
     *
     * A customer object is created with name,phNo and address. IVerify is an interfaces that implements the method to verify customer and
     * returns a boolean result back to the caller.
     *
     * Inhouse verifier class just validates the customer based on internal capability. This doesn not make use of adaptor class.
     *
     * The ABCvalidator and XYXchecker are two classes that are external packages for customer verifications.
     *
     * The ABC adaptor class is the middleware class that calls the external package ABCValidator to make use of their  functionality such as
     * validating phone number.
     *
     * The XYZ Checker class is the middleware class that calls the external package XYZAdapter to make use of their functionality such running background checks.
     *
     */

    public static void main(String[] args) {

        Customer C1 = new Customer();
        C1.setName("Alice");
        C1.setPhNo("222-333-4444");
        C1.setAddress("123 Main St, Boston, MA");

        IVerify CustC1Name = new InHouseVerifier();
        if (CustC1Name.verifyCustomer(C1)) {
            System.out.println("Doing in house verification for " + C1.getName());
        }
        if (!CustC1Name.verifyCustomer(C1)) {
            System.out.println("Verification failed for " + C1.getName());
        }

        IVerify CustC1PhNo = new ABCAdapter();
        if (CustC1PhNo.verifyCustomer(C1)) {
            System.out.println(" ABC third-party verification for " +C1.getName() + ", " + C1.getPhNo());
        }

        if (!CustC1PhNo.verifyCustomer(C1)) {
            System.out.println(" ABC third-party verification failed for " +C1.getName() + ", " + C1.getPhNo());
        }

        IVerify CustC1Address = new XYZAdapter();
        if(CustC1Address.verifyCustomer(C1)) {
            System.out.println(" XYZ third-party background verification for " +C1.getName() + ", " + C1.getAddress());
        }

        if(!CustC1Address.verifyCustomer(C1)) {
            System.out.println(" XYZ third-party background verification failed for " +C1.getName() + ", " + C1.getAddress());
        }
    }
}
