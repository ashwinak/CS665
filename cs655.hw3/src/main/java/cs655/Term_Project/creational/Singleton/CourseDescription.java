package cs655.Term_Project.creational.Singleton;

public class CourseDescription implements PrintHTML {

    private final String Description;
    private final String CourseName;


    public CourseDescription(String CourseName, String description) {
        this.CourseName = CourseName;
        Description = description;
    }

    @Override
    public void showHTMLFormat() {
        System.out.println("<html> This is the Course Description for " +Description + " </html>");
    }
}
