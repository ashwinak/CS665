package cs655.Term_Project.creational.AbstractFactoryPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    The Department keeps track of the courses offered each semester. The department also wants to
    know the students enrolled in a given course for a particular semester.
 */
public class CSDepartmentFactory extends DepartmentFactory {

    String DeptName = "CSDepartment";
    String DegreeType;
    String CertificateName;

    Integer Score;
    String GPA;

    public CSDepartmentFactory(Integer score, String GPA) {
        Score = score;
        this.GPA = GPA;
    }

    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer score) {
        Score = score;
    }

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

    public CSDepartmentFactory(String deptName, String degreeType, String certificateName) {
        DeptName = deptName;
        DegreeType = degreeType;
        CertificateName = certificateName;
    }

    public CSDepartmentFactory() {

    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public String getDegreeType() {
        return DegreeType;
    }

    public void setDegreeType(String degreeType) {
        DegreeType = degreeType;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String certificateName) {
        CertificateName = certificateName;
    }

    public ArrayList<String> getFacultyInfo() {
        Faculty FacInfo = new Faculty();
        ArrayList<String> FacList = new ArrayList<>();
        FacList.add(FacInfo.setChairperson("Andy"));
        FacList.add(FacInfo.setFullTimeFaculty("Bill"));
        FacList.add(FacInfo.setFullTimeUGAdvisor("David"));
        FacList.add(FacInfo.setFullTimePGAdvisor("Messi"));
        FacList.add(FacInfo.setPartTimeFaculty("Charlie"));
        return FacList;
    }

    public Map getFacultyCourseList() {
        Faculty FacCourseList = new Faculty();
        Map <String, ArrayList<String>> FacCLMap = new HashMap<>();
        ArrayList<String> FacCL = new ArrayList<>();
        FacCL.add(Concentration.Programming_Langauges.toString());
        FacCL.add(Concentration.Software_Engineering.toString());
        FacCL.add("Stu1");
        FacCL.add("Stu2");
        FacCL.add("Stu3");
        FacCLMap.put("Andy",FacCL);
        return FacCLMap;
    }

    public Map getCourseMapConc() {
        Map ConcArea = new HashMap<>();
        Map SubConcArea = new HashMap<>();
        Courses showCourseList = new Courses(ConcArea,SubConcArea);
        return showCourseList.CourseMap("");
    }
    public Map getCourseMapSubConc() {
        Map ConcArea = new HashMap<>();
        Map SubConcArea = new HashMap<>();
        Courses showCourseList = new Courses(ConcArea,SubConcArea);
        return showCourseList.CourseMap("Programming_Langauges");
    }

    public Map getCourseChairPersonFaculty() {
        Courses C1 = new Courses();
        return C1.CourseChairPersonFaculty();
    }

    public Map getCourseFullTimeFaculty() {
        Courses C1 = new Courses();
        return C1.CourseFullTimeFaculty();
    }

    public Map getCourseInfo() {
        Courses C1 = new Courses();
        System.out.println(Arrays.toString(C1.CourseInfo().entrySet().toArray()));
        return C1.CourseInfo();
    }

    public Map getStudentInfo() {
        Students StuInfo = new Students();
        Map <String, ArrayList<String>> StuInfoMap = new HashMap<>();
        ArrayList<String> Stu1 = new ArrayList<>();
        Stu1.add("Computer Science");
        Stu1.add(Concentration.Software_Engineering.toString());
        Stu1.add("Semester 1");
        Stu1.add(StuInfo.setThesisAdvisor("Andy"));
        Stu1.add("GPA is B");
        StuInfoMap.put(StuInfo.setStudentName("Student1"),Stu1);
        return StuInfoMap;
    }
    public Map getCourseListPerSememster() {
        Courses CL = new Courses();
        Map <String, ArrayList<String>> CLMap = new HashMap<>();
        ArrayList<String> CL1 = new ArrayList<>();
        CL1.add(Concentration.Software_Engineering.toString());
        CL1.add(Concentration.Databases.toString());
        CL1.add(Concentration.Programming_Langauges.toString());
        CLMap.put("Semester1",CL1);
        return CLMap;
    }

    public Map getStudentEnrolledPerCourse() {
        Courses SL = new Courses();
        Map <String, ArrayList<String>> SLMap = new HashMap<>();
        ArrayList<String> SL1 = new ArrayList<>();
        SL1.add("Stu1");
        SL1.add("Stu2");
        SL1.add("Stu3");
        SLMap.put(Concentration.Programming_Langauges.toString(),SL1);
        return SLMap;
    }


    @Override
    public Degree CreateDegreeProgram(String program) {
        if (program == "PGD") {
            return new PostGradDegree();
        } else if (program =="UGD") {
            return new UnderGradDegree();
        }
        return new CertificationProgram();
    }

    @Override
    public Staff CreateFaculty() {
        return new Faculty();
    }

    @Override
    public Curriculam CreateCourses() {
        return new Courses();
    }

    @Override
    public StudentProduct CreateStudent() {
        return new Students();
    }
}
