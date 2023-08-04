package cs655.hw5.part1;

public class InterestRateListener implements Listener{

    private String Name;
    private Integer rate = 2;

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public InterestRateListener(String name) {
        Name = name;
    }

    @Override
    public void update(String eventType) {
        System.out.println("Message received by " +Name+ " : Interest rate being increased...");


    }
}
