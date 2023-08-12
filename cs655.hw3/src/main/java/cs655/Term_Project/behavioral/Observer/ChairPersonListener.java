package cs655.Term_Project.behavioral.Observer;

public class ChairPersonListener extends Faculty implements Listener {

    private String Name;
    private Integer Limit = 2;

    public Integer getLimit() {
        return Limit;
    }

    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ChairPersonListener(String name) {
        Name = name;
    }

    public ChairPersonListener(int Limit) {
        Limit = Limit;
    }

    @Override
    public void update(String eventType) {
        System.out.println("Message received by " +Name+ " : Enrollment limit has reached");

    }
}
