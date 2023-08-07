package cs655.Term_Project.General;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        CSDepartment CSDept = new CSDepartment();
        CSDept.setDeptName("Computer Science");

        UnderGradDegree UG = new UnderGradDegree("UnderGrad");
        System.out.println(UG.getUnderGrad().get("CIS"));

        PostGradDegree PG = new PostGradDegree("PostGrad");
        System.out.println(PG.getPostGrad().get("CS"));

        CertificationProgram CertPGM = new CertificationProgram("CertPGM");
        System.out.println(CertPGM.getCertProgram().get("Security"));







    }
}
