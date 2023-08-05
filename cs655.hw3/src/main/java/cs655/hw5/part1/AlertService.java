package cs655.hw5.part1;

import java.util.*;

import static cs655.hw5.part1.Alerts.Interest_Rate;
import static cs655.hw5.part1.Alerts.New_Product;


public class AlertService implements Bank {
    private final Map<Alerts, List<Listener>> customers;
    private AlertService AlertSvc;

    public AlertService() {
        customers = new HashMap<>();
        Arrays.stream(Alerts.values()).forEach(event -> customers.put(event, new ArrayList<>()));
    }

    public void newProductIntro(String Product_Name) {
        notifyCustomers(New_Product);
    }

    public void Interest_Rate_Change() {
        notifyCustomers(Interest_Rate);
    }

    @Override
    public void register(Alerts eventType, Listener listener) {
        customers.get(eventType).add(listener);
    }
    @Override
    public void deregister(Alerts eventType, Listener listener) {
        customers.get(eventType).remove(listener);
    }
    @Override
    public void notifyCustomers(Alerts eventType) {
        customers.get(eventType).forEach(listener -> listener.update("new Product"));
    }
}