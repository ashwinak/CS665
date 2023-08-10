package cs655.Term_Project.General;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        CSDepartment CSDept = new CSDepartment();
        CSDept.setDeptName("Computer Science");
        System.out.println(CSDept.getFacultyInfo());

        UnderGradDegree UG = new UnderGradDegree("UnderGrad");
        System.out.println(UG.getUnderGrad().get("CIS"));

        PostGradDegree PG = new PostGradDegree("PostGrad");
        System.out.println(PG.getPostGrad().get("CS"));

        CertificationProgram CertPGM = new CertificationProgram("CertPGM");
        System.out.println(CertPGM.getCertProgram().get("Security"));

        System.out.println(CSDept.getCourseMapConc());

        System.out.println(CSDept.getCourseMapSubConc());

        System.out.println(CSDept.getCourseChairPersonFaculty());

        System.out.println(CSDept.getCourseFullTimeFaculty());

        CSDept.getCourseInfo();

        System.out.println(CSDept.getStudentInfo());

        System.out.println(CSDept.getFacultyCourseList());

        System.out.println(CSDept.getCourseListPerSememster());
        System.out.println(CSDept.getStudentEnrolledPerCourse());

        Courses enroll = new Courses();
        System.out.println(enroll.CourseEnrollORDrop("Adam",Concentration.Databases,true));
        System.out.println(enroll.CourseEnrollORDrop("Jack",Concentration.Databases,true));
        System.out.println(enroll.CourseEnrollORDrop("Messi",Concentration.Databases,true));
        System.out.println(enroll.CourseEnrollORDrop("Peter",Concentration.Databases,true));

        System.out.println("Now testing auto enroll");
        System.out.println(enroll.CourseEnrollORDrop("Messi",Concentration.Databases,false));








    }
}
