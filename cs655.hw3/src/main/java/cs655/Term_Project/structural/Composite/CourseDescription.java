package cs655.Term_Project.structural.Composite;

public class CourseDescription implements PrintHTML {

    private final String CourseName;


    public CourseDescription(String CourseName) {
        this.CourseName = CourseName;
    }

    @Override
    public void showHTMLFormat() {
        System.out.println("<html> This is the Course Description for " +CourseName + " </html>");
    }
}
