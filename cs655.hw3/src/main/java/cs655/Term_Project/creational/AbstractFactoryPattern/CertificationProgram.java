package cs655.Term_Project.creational.AbstractFactoryPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CertificationProgram extends Degree {
    private  Map<String, List<String>> CertProgram ;
    String Name;

    public CertificationProgram() {

    }

    @Override
    public String toString(){
        return "**Creating Certification Program**";
    }


    public CertificationProgram(String Name) {
        CertProgram = new HashMap<>();
        CertProgram.put(Name,new ArrayList<>());
    }

    public CertificationProgram(String deptName, String degreeType, String certificateName, Map<String, List<String>> certProgram, String name) {
//        super(deptName, degreeType, certificateName);
        CertProgram = certProgram;
        Name = name;
    }

    public CertificationProgram(Map<String, List<String>> certProgram, String name) {
        CertProgram = certProgram;
        Name = name;
    }

    public Map<String, List<String>> getCertProgram() {
        ArrayList<String> SecurityProgram = new ArrayList<>();
        SecurityProgram.add("4 Core Courses");
        SecurityProgram.add("No Time Limit");
        CertProgram.put("Security",SecurityProgram);

        ArrayList<String> WebTechnologyProgram = new ArrayList<>();
        WebTechnologyProgram.add("4 Core Courses");
        WebTechnologyProgram.add("No Time Limit");
        CertProgram.put("Web_Technology",WebTechnologyProgram);

        ArrayList<String> AnalyticsProgram = new ArrayList<>();
        AnalyticsProgram.add("4 Core Courses");
        AnalyticsProgram.add("No Time Limit");
        CertProgram.put("Analytics",AnalyticsProgram);
        CertProgram.remove("CertProgram");

        return CertProgram;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
