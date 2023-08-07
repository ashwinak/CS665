package cs655.Term_Project.General;

import java.util.List;
import java.util.Map;

public class Courses extends CSDepartment {
    private final Map<Concentration, List<Courses>> ConcAreas;

    String CourseDescription;
    String Syllabus;


    public Courses(Map<Concentration, List<Courses>> concAreas) {
        ConcAreas = concAreas;
    }

    public String format() {
        //return html format of the course.
        return "html";
    }


}
