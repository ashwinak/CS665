package cs655.hw5.part1;

import java.util.*;


public class AlertService {

    private final Map<Alerts, List<Listener>> customers;

    public AlertService() {
        customers = new HashMap<>();
        Arrays.stream(Alerts.values()).forEach(event -> customers.put(event, new ArrayList<>()));
    }

    public void register(Alerts eventType, Listener listener) {
        customers.get(eventType).add(listener);
    }

    public void deregister(Alerts eventType, Listener listener) {
        customers.get(eventType).remove(listener);
    }

    public void notifyCustomers(Alerts eventType) {
        customers.get(eventType).forEach(listener -> listener.update("new Product"));
    }

}
