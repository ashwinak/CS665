package cs655.hw5.part1;

public class App {

    public static void main(String[] args) {
        Bank B1 = new Bank();

        System.out.println("Product Info Message by subject1\n");
        B1.getService().register(Alerts.New_Product,new ProductListener("Alice"));
        B1.getService().register(Alerts.New_Product,new ProductListener("Bob"));

        B1.newProductIntro("Auto Loans");

        B1.getService().register(Alerts.Interest_Rate, new InterestRateListener("Charlie"));
        B1.getService().register(Alerts.Interest_Rate, new InterestRateListener("Dave"));
        System.out.println();
        System.out.println("Product Info Message by subject2\n");

        InterestRateListener RateChange = new InterestRateListener("Rate_Change");
        RateChange.setRate(5);
        if (RateChange.getRate()>3) {
            B1.Interest_Rate_Change();
        }
    }
}
