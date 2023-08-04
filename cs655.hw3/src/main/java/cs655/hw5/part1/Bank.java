package cs655.hw5.part1;
import static cs655.hw5.part1.Alerts.*;

public class Bank {
    private final AlertService AlertSvc;

    public Bank() {
        AlertSvc = new AlertService();
    }

    public void newProductIntro(String Product_Name) {

        AlertSvc.notifyCustomers(New_Product);
    }

    public void Interest_Rate_Change() {
        AlertSvc.notifyCustomers(Interest_Rate);
    }
    public AlertService getService() {
        return AlertSvc;
    }
}
