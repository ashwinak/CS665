package cs655.Term_Project.General;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CSDepartment implements Department {

    String DeptName = "CSDepartment";
    String DegreeType;
    String CertificateName;

    public CSDepartment(String deptName, String degreeType, String certificateName) {
        DeptName = deptName;
        DegreeType = degreeType;
        CertificateName = certificateName;
    }

    public CSDepartment() {

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

    @Override
    public void DepartmentName(String DeptName) {

    }

    @Override
    public void DegreeInfo(String DegreeType) {

    }

    @Override
    public void CertificationInfo(String CertificateName) {

    }
}
