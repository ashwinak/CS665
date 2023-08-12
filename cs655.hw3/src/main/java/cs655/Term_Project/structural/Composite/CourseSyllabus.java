package cs655.Term_Project.structural.Composite;

public class CourseSyllabus implements PrintHTML {

    private final String CourseName;

    public CourseSyllabus(String CourseName) {
        this.CourseName = CourseName;
    }

    @Override
    public void showHTMLFormat() {
        System.out.println("<html> This is the Syllabus for " +CourseName + " </html>");

    }
}
