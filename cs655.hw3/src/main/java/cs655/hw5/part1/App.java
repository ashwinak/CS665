package cs655.hw5.part1;

public class App {

    /**
     * @param args
     *  The main App code creates a new AlertService instance which implements Bank interface.
     *  The alertservice class implements a hashmap named customers which has Alerts of type enum as key and arraylist of customers/listeners
     *  as value. The alertservice class adds all Alertable event and customers to the hashmap.
     *
     *  All the relevant methods such as register/deregister/notify along with new product intro and interest rate change methods are implemented
     *  by the Alert service. The listener class and its implementors create new listeners i.e customers that are interested in the specific event.
     *
     *
     */

    public static void main(String[] args) {
        AlertService A1 = new AlertService();

        System.out.println("Product Info Message by subject1\n");
        A1.register(Alerts.New_Product, new ProductListener("Alice"));
        A1.register(Alerts.New_Product, new ProductListener("Bob"));

        A1.newProductIntro("Auto Loans");

        A1.register(Alerts.Interest_Rate, new InterestRateListener("Charlie"));
        A1.register(Alerts.Interest_Rate, new InterestRateListener("Dave"));
        System.out.println();
        System.out.println("Product Info Message by subject2\n");

        InterestRateListener RateChange = new InterestRateListener("Rate_Change");

        RateChange.setRate(5);
        if (RateChange.getRate() > 3) {
            A1.Interest_Rate_Change();
        }
    }
}
