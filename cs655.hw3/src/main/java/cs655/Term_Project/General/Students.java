package cs655.Term_Project.General;

import java.util.List;
import java.util.Map;

public class Students extends CSDepartment {
//    private final Map<Concentration, List<Courses>> ConcAreas;
    String ProgramEnrolled;
    String CoursesEnrolled;

    String ThesisEnrolled;

    String ThesisAdvisor;

    public double GPA() {
        //Return GPA of the student. A=4,B=3,C=2,D=1,F=0
        return 2.0;
    }

}
