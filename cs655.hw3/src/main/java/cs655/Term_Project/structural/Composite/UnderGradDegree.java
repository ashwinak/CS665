package cs655.Term_Project.structural.Composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnderGradDegree extends CSDepartment {

    private final Map<String, List<String>> UnderGrad ;
    String Name;

    public Map<String, List<String>> getUnderGrad() {
//        UnderGradDegree UG = new UnderGradDegree("UnderGrad");
        ArrayList<String> UG_CS = new ArrayList<>();
        UG_CS.add("6 Core Courses");
        UG_CS.add("4 Elective Courses");
        UG_CS.add("4 year term");
        UnderGrad.put("CS",UG_CS);

        ArrayList<String> UG_CIS = new ArrayList<>();
        UG_CIS.add("6 Core Courses");
        UG_CIS.add("2 Elective Courses");
        UG_CIS.add("4 year term");
        UnderGrad.put("CIS",UG_CIS);
        UnderGrad.remove("UnderGrad");
        return UnderGrad;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public UnderGradDegree(String Name) {
        UnderGrad = new HashMap<>();
        UnderGrad.put(Name,new ArrayList<>());
    }

    public UnderGradDegree(String deptName, String degreeType, String certificateName, Map<String, List<String>> underGrad) {
        super(deptName, degreeType, certificateName);
        UnderGrad = underGrad;
    }

    public UnderGradDegree(Map<String, List<String>> underGrad) {
        UnderGrad = underGrad;
    }


}
