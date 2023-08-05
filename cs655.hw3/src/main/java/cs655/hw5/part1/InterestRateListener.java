package cs655.hw5.part1;

public class InterestRateListener implements Listener{

    private String Name;
    private Integer Rate = 2;

    public Integer getRate() {
        return Rate;
    }

    public void setRate(Integer rate) {
        this.Rate = rate;
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

    public InterestRateListener(int rate) {
        Rate = rate;
    }

    @Override
    public void update(String eventType) {
        System.out.println("Message received by " +Name+ " : Interest rate being increased...");


    }
}
