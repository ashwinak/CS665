package cs655.Term_Project.behavioral.Strategy;


public class GPAService {

    Integer Score;
    String GPA;

//    public int calculateTotal(int Score){
//        int sum = 0;
//        for(Item item : items){
//            sum += item.getPrice();
//        }
//        return sum;
//    }

    public String getGPA(CalculatorStrategy GPACalculatorMethod, int Score){
        GPA = GPACalculatorMethod.CalculateScore(Score);
        return GPA;
    }


//    public Integer getScore() {
//        return Score;
//    }

    public void setScore(Integer score) {
        Score = score;
    }

//    public String getGPA() {
//        return GPA;
//    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

//    public GPAService(Integer score, String GPA) {
//        Score = score;
//        this.GPA = GPA;
//    }
}
