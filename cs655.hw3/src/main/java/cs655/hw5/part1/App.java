package cs655.hw5.part1;

public class App {

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
