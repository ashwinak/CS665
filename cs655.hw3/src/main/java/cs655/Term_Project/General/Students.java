package cs655.Term_Project.General;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Students extends CSDepartment {
//    private final Map<Concentration, List<Courses>> ConcAreas;
    String ProgramEnrolled;
    String CoursesEnrolled;
    String ThesisEnrolled;
    String ThesisAdvisor;

    String StudentName;

    public String getStudentName() {
        return StudentName;
    }

    public String setStudentName(String studentName) {
        StudentName = studentName;
        return StudentName;
    }

    public Students() {

    }

    public String getProgramEnrolled() {
        return ProgramEnrolled;
    }

    public void setProgramEnrolled(String programEnrolled) {
        ProgramEnrolled = programEnrolled;
    }

    public String getCoursesEnrolled() {
        return CoursesEnrolled;
    }

    public void setCoursesEnrolled(String coursesEnrolled) {
        CoursesEnrolled = coursesEnrolled;
    }

    public String getThesisEnrolled() {
        return ThesisEnrolled;
    }

    public void setThesisEnrolled(String thesisEnrolled) {
        ThesisEnrolled = thesisEnrolled;
    }

    public String getThesisAdvisor() {
        return ThesisAdvisor;
    }

    public String setThesisAdvisor(String thesisAdvisor) {
        ThesisAdvisor = thesisAdvisor;
        return ThesisAdvisor;
    }

    public Students(String deptName, String degreeType, String certificateName, String programEnrolled, String coursesEnrolled, String thesisEnrolled, String thesisAdvisor) {
        super(deptName, degreeType, certificateName);
        ProgramEnrolled = programEnrolled;
        CoursesEnrolled = coursesEnrolled;
        ThesisEnrolled = thesisEnrolled;
        ThesisAdvisor = thesisAdvisor;
    }

    public Students(String programEnrolled, String coursesEnrolled, String thesisEnrolled, String thesisAdvisor) {
        ProgramEnrolled = programEnrolled;
        CoursesEnrolled = coursesEnrolled;
        ThesisEnrolled = thesisEnrolled;
        ThesisAdvisor = thesisAdvisor;
    }


    public double GPA(String GPA) {
        //Return GPA of the student. A=4,B=3,C=2,D=1,F=0
        if(Objects.equals(GPA, "A")) {
            return 4.0;
        }
        if(Objects.equals(GPA, "B")) {
            return 3.0;
        }
        if(Objects.equals(GPA, "C")) {
            return 2.0;
        }
        if(Objects.equals(GPA, "D")) {
            return 1.0;
        }
        return 0.0;
    }

}
