package cs655.Term_Project.structural.Proxy;

public class CourseSyllabus implements PrintHTML {

    private final String Syllabus;
    private final String CourseName;

    public CourseSyllabus(String CourseName, String syllabus) {
        this.CourseName = CourseName;
        Syllabus = syllabus;
    }

    @Override
    public void showHTMLFormat() {
        System.out.println("<html> This is the Syllabus for " +Syllabus + " </html>");

    }
}
