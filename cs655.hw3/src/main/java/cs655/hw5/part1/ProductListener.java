package cs655.hw5.part1;

public class ProductListener implements Listener {

//    @Override
//    public void update(Alerts eventType) {
//        System.out.println("New product intro");
//
//    }
    private String Name;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public ProductListener(String Name) {
        this.Name = Name;
    }

    @Override
    public void update(String eventType) {
        System.out.println("Message received by " + Name + " : New products for Auto Loans..." );

    }
}
