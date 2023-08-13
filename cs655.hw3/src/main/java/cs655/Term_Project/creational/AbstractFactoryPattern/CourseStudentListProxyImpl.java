package cs655.Term_Project.creational.AbstractFactoryPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CourseStudentListProxyImpl implements CSDeptDB {

    public CourseStudentListProxyImpl() {
        CacheMiss();
    }

    private String data;
    private static volatile CourseStudentListProxyImpl instance;

    private CourseStudentListProxyImpl(String data) {
        this.data = data;
    }
    public static CourseStudentListProxyImpl getInstance(String data) {
        CourseStudentListProxyImpl result = instance;
        if (result == null) {
            synchronized (CourseStudentListProxyImpl.class) {
                result = instance;
                if (result == null) {
                    instance = result = new CourseStudentListProxyImpl(data);
                }
            }
        }
        return result;
    }

    @Override
    public void process() {
        System.out.println();
        System.out.println("Cache hit. Serving request directly from Cache......");
        System.out.println();
        System.out.println("**********************Courses Offered Each Semester");
        System.out.println();
        System.out.println(Arrays.toString(CoursesOfferedEachSememter().entrySet().toArray()));
        System.out.println();
        System.out.println("**********************Students Enrolled PerCourse PerSemester");
        System.out.println();
        System.out.println(Arrays.toString(StudentsEnrolledPerCoursePerSemester().entrySet().toArray()));
        System.out.println("**********************");
    }

    private void CacheMiss() {
        System.out.println();
        System.out.println("Requesting fresh copy from server due to cache miss......");
        System.out.println();
        System.out.println("**********************Courses Offered Each Semester");
        System.out.println();
        System.out.println(Arrays.toString(CoursesOfferedEachSememter().entrySet().toArray()));
        System.out.println();
        System.out.println("**********************Students Enrolled PerCourse PerSemester");
        System.out.println();
        System.out.println(Arrays.toString(StudentsEnrolledPerCoursePerSemester().entrySet().toArray()));
        System.out.println("**********************");
    }

    public Map CoursesOfferedEachSememter() {
        Map<String, ArrayList<Concentration>> CoursesOfferedPerSemester = new HashMap<>();
        ArrayList<Concentration> ALC = new ArrayList<>();
        ALC.add(Concentration.Databases);
        ALC.add(Concentration.Systems);
        ALC.add(Concentration.Software_Engineering);
        ALC.add(Concentration.Programming_Langauges);
        CoursesOfferedPerSemester.put("Spring",ALC);
        CoursesOfferedPerSemester.put("Summer",ALC);
        CoursesOfferedPerSemester.put("Fall",ALC);
        CoursesOfferedPerSemester.put("Winter",ALC);
        return CoursesOfferedPerSemester;
    }

    public Map StudentsEnrolledPerCoursePerSemester() {
        Map<Concentration, ArrayList<String>> StudentCourseEnrollmentList = new HashMap<>();
        ArrayList<String> ALC = new ArrayList<>();
        ALC.add("Messi");
        ALC.add("Ronaldo");
        ALC.add("Neymar");
        ALC.add("Ronaldinho");
        StudentCourseEnrollmentList.put(Concentration.Databases,ALC);
        StudentCourseEnrollmentList.put(Concentration.Systems,ALC);
        StudentCourseEnrollmentList.put(Concentration.Software_Engineering,ALC);
        StudentCourseEnrollmentList.put(Concentration.Programming_Langauges,ALC);
        return StudentCourseEnrollmentList;
    }
}
