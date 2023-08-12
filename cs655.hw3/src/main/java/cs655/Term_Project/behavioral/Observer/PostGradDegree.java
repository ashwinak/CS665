package cs655.Term_Project.behavioral.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostGradDegree extends CSDepartment {
    private final Map<String, List<String>> PostGrad ;
    String Name;

    public Map<String, List<String>> getPostGrad() {
//        PostGradDegree PG = new PostGradDegree("PostGrad");
        ArrayList<String> PG_CS = new ArrayList<>();
        PG_CS.add("6 Core Courses");
        PG_CS.add("4 Elective Courses");
        PG_CS.add("2 year term");
        PostGrad.put("CS",PG_CS);

        ArrayList<String> PG_CIS = new ArrayList<>();
        PG_CIS.add("6 Core Courses");
        PG_CIS.add("2 Elective Courses");
        PG_CIS.add("2 year term");
        PostGrad.put("CIS",PG_CIS);

        ArrayList<String> PG_DA = new ArrayList<>();
        PG_DA.add("6 Core Courses");
        PG_DA.add("2 Elective Courses");
        PG_DA.add("2 year term");
        PostGrad.put("DA",PG_DA);
        PostGrad.remove("PostGrad");

        return PostGrad;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public PostGradDegree(String Name) {
        PostGrad = new HashMap<>();
        PostGrad.put(Name,new ArrayList<>());
    }

    public PostGradDegree(String deptName, String degreeType, String certificateName, Map<String, List<String>> PostGrad, Map<String, List<String>> postGrad) {
        super(deptName, degreeType, certificateName);
        this.PostGrad = postGrad;
    }

    public PostGradDegree(Map<String, List<String>> PostGrad, Map<String, List<String>> postGrad) {
        this.PostGrad = postGrad;
    }

}
