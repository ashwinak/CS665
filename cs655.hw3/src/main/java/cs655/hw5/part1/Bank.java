package cs655.hw5.part1;
import static cs655.hw5.part1.Alerts.*;

public interface Bank {
    void register(Alerts eventType, Listener listener);

    void deregister(Alerts eventType, Listener listener);

    void notifyCustomers(Alerts eventType);
}