package cs655.Term_Project.creational.Singleton;

public class CourseStudentListProxy implements CSDeptDB {
    private static CSDeptDB object;

    private final String data;
    private static volatile CourseStudentListProxy instance;

    private CourseStudentListProxy(String data) {
        this.data = data;
    }
    public static CourseStudentListProxy getInstance(String data) {
        CourseStudentListProxy result = instance;
        if (result == null) {
            synchronized (CourseStudentListProxy.class) {
                result = instance;
                if (result == null) {
                    instance = result = new CourseStudentListProxy(data);
                }
            }
        }
        return result;
    }

    @Override
    public void process() {
        if (object == null) {
//            object = new CourseStudentListProxyImpl();
            object = CourseStudentListProxyImpl.getInstance("Singleton");
        } else {
            object.process();
        }

    }
}
