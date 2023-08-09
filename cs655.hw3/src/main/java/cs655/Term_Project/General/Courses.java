package cs655.Term_Project.General;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Courses extends CSDepartment {
    private  Map<Concentration, ArrayList<String>> ConcAreas;
    private  Map<Concentration, Map<Concentration,ArrayList<String>>> SubConcAreas;

    String CourseDescription;
    String Syllabus;

    String FacultyName;

    public Courses() {

    }

    public String getFacultyName() {
        return FacultyName;
    }

    public void setFacultyName(String facultyName) {
        FacultyName = facultyName;
    }


    public Courses(Map<Concentration, ArrayList<String>> concAreas, Map<Concentration, Map<Concentration, ArrayList<String>>> subConcAreas) {
        ConcAreas = concAreas;
        SubConcAreas = subConcAreas;
    }

    public Map CourseMap(String CourseName) {
        //Systems
        ArrayList<String> Systems = new ArrayList<>();
        Systems.add("Software_Systems");
        Systems.add("Networking_Systems");
        Systems.add("Platform_Systems");
        ConcAreas.put(Concentration.Systems,Systems);

        //Programming_Langauges with SubConcentration.
        Map<Concentration,ArrayList<String>> SubConcentration = new HashMap<>();
        ArrayList<String> PDL = new ArrayList<>();
        PDL.add("PDL 1");
        PDL.add("PDL 2");
        SubConcentration.put(Concentration.Procedural_Langauges,PDL);
        ArrayList<String> OOPL = new ArrayList<>();
        OOPL.add("OOPS 1");
        OOPL.add("OOPS 2");
        SubConcentration.put(Concentration.Object_Oriented_Langauges,OOPL);
        ArrayList<String> FL = new ArrayList<>();
        FL.add("FL 1");
        FL.add("FL 2");
        SubConcentration.put(Concentration.Functional_Langauges,FL);
        SubConcAreas.put(Concentration.Programming_Langauges,SubConcentration);
        
        //Databases
        ArrayList<String> Database = new ArrayList<>();
        Database.add("DBMS 1");
        Database.add("DBMS 2");
        ConcAreas.put(Concentration.Databases,Database);

        //Software Engineering
        ArrayList<String> SE = new ArrayList<>();
        SE.add("SE 1");
        SE.add("SE 2");
        ConcAreas.put(Concentration.Software_Engineering,SE);
        
        if (CourseName == "Programming_Langauges") {
            return SubConcAreas;
        }
        return ConcAreas;
    }

    public Map CourseChairPersonFaculty() {
        Faculty CourseFaculty = new Faculty();
        Map FacultyMap = new HashMap<>();
        //Setting Chair person for all Concentration
        FacultyMap.put(Concentration.Databases,CourseFaculty.setChairperson("Andy"));
        FacultyMap.put(Concentration.Systems,CourseFaculty.setChairperson("Andy"));
        FacultyMap.put(Concentration.Programming_Langauges,CourseFaculty.setChairperson("Andy"));
        FacultyMap.put(Concentration.Software_Engineering,CourseFaculty.setChairperson("Andy"));
        return FacultyMap;
    }

    public Map CourseFullTimeFaculty() {
        Faculty CourseFaculty = new Faculty();
        Map FacultyMap = new HashMap<>();
        //Setting Chair person for all Concentration
        FacultyMap.put(Concentration.Databases,CourseFaculty.setChairperson("Bill"));
        FacultyMap.put(Concentration.Systems,CourseFaculty.setChairperson("Bill"));
        FacultyMap.put(Concentration.Programming_Langauges,CourseFaculty.setChairperson("Bill"));
        FacultyMap.put(Concentration.Software_Engineering,CourseFaculty.setChairperson("Bill"));
        return FacultyMap;
    }

    public Map CourseInfo() {
        Courses C1 = new Courses();
        Map<Concentration, String> CourseInfo = new HashMap<>();
        CourseInfo.put(Concentration.Databases,"***Course Description1*** \n" +
                "**Course Syllabus1**");
        CourseInfo.put(Concentration.Systems,"***Course Description2*** \n" +
                "**Course Syllabus2**");

        CourseInfo.put(Concentration.Programming_Langauges,"***Course Description3*** \n" +
                "**Course Syllabus3**");

        CourseInfo.put(Concentration.Software_Engineering,"***Course Description4*** \n" +
                "**Course Syllabus4**");

        return CourseInfo;

    }

    public String format() {
        //return html format of the course.
        return "html";
    }


}
