package cs655.Term_Project.creational.AbstractFactory;

public class CourseStudentListProxy implements CSDeptDB {

    private static CSDeptDB object;

    @Override
    public void process() {
        if (object == null) {
            object = new CourseStudentListProxyImpl();
        } else {
            object.process();
        }

    }
}
