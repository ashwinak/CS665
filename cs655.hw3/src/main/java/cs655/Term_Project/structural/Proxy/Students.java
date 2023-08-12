package cs655.Term_Project.structural.Proxy;

public class Students extends CSDepartment implements CalculatorStrategy {
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

    @Override
    public String CalculateScore(int Score) {
        if(Score >=93) {
            return "A";
        }
        if(Score >=90 & Score <93) {
            return "B";
        }
        if(Score >=80 & Score <90) {
            return "C";
        }
        if(Score >=70 & Score <80) {
            return "D";
        }
        return "F";
    }
}
