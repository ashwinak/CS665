package cs655.Term_Project.common_NoPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Courses extends CSDepartment {
    private  Map<Concentration, ArrayList<String>> ConcAreas;
    private  Map<Concentration, Map<Concentration,ArrayList<String>>> SubConcAreas;

    String CourseDescription;
    String Syllabus;

    String FacultyName;

    boolean EnrollCourse;

    boolean DropCourse;

    String NotifyChairPerson;

    public Courses(String deptName, String degreeType, String certificateName, boolean enrollCourse, boolean dropCourse, String notifyChairPerson) {
        super(deptName, degreeType, certificateName);
        EnrollCourse = enrollCourse;
        DropCourse = dropCourse;
        NotifyChairPerson = notifyChairPerson;
    }

    public boolean isEnrollCourse() {
        return EnrollCourse;
    }

    public void setEnrollCourse(boolean enrollCourse) {
        EnrollCourse = enrollCourse;
    }

    public boolean isDropCourse() {
        return DropCourse;
    }

    public void setDropCourse(boolean dropCourse) {
        DropCourse = dropCourse;
    }

    public String getNotifyChairPerson() {
        return NotifyChairPerson;
    }

    public void setNotifyChairPerson(String notifyChairPerson) {
        NotifyChairPerson = notifyChairPerson;
    }

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
//Course Enroll and waitlist.
    Map<Concentration,Integer> CourseLimit = new HashMap<>();
    Map<Concentration,ArrayList<String>> CourseWaitList = new HashMap<>();
    ArrayList<String> StudentWaitListSystems = new ArrayList<>();
    ArrayList<String> StudentWaitListDatabases = new ArrayList<>();
    ArrayList<String> StudentWaitListSoftware_Engineering = new ArrayList<>();
    ArrayList<String> StudentWaitListProgramming_Langauges = new ArrayList<>();

    public boolean CourseEnrollORDrop(String StudentName, Concentration Course, Boolean Enroll) {
        if (CourseLimit.isEmpty()) {
            CourseLimit.put(Concentration.Systems, 3);
            CourseLimit.put(Concentration.Databases,3);
            CourseLimit.put(Concentration.Software_Engineering,3);
            CourseLimit.put(Concentration.Programming_Langauges,3);
        }
        if(Enroll = true) {
            if (CourseLimit.get(Concentration.Systems) == 0) {
                StudentWaitListSystems.add(StudentName);
                CourseWaitList.put(Concentration.Systems,StudentWaitListSystems);
                System.out.println("To Chairman : " + Concentration.Systems.toString() + " is full");
                return false;
            }
            else if (CourseLimit.get(Concentration.Databases)==0){
                StudentWaitListDatabases.add(StudentName);
                CourseWaitList.put(Concentration.Databases,StudentWaitListDatabases);
                System.out.println("To Chairman : " + Concentration.Databases.toString() + " is full");
                return false;
            }
            else if (CourseLimit.get(Concentration.Software_Engineering)==0){
                StudentWaitListSoftware_Engineering.add(StudentName);
                CourseWaitList.put(Concentration.Software_Engineering,StudentWaitListSoftware_Engineering);
                System.out.println("To Chairman : " + Concentration.Software_Engineering.toString() + " is full");
                return false;
            }
            else if (CourseLimit.get(Concentration.Programming_Langauges)==0){
                StudentWaitListProgramming_Langauges.add(StudentName);
                CourseWaitList.put(Concentration.Programming_Langauges,StudentWaitListProgramming_Langauges);
                System.out.println("To Chairman : " + Concentration.Programming_Langauges.toString() + " is full");
                return false;
            }

        }
        if(Enroll = true) {
            switch (Course) {
                case Databases:
                    CourseLimit.put(Concentration.Databases, CourseLimit.get(Concentration.Databases) - 1);
                    System.out.println("Enrolled " + StudentName + " to " + Concentration.Databases.toString());
                    break;
                case Systems:
                    CourseLimit.put(Concentration.Systems, CourseLimit.get(Concentration.Systems) - 1);
                    System.out.println("Enrolled " + StudentName + " to " + Concentration.Systems.toString());
                    break;
                case Software_Engineering:
                    CourseLimit.put(Concentration.Software_Engineering, CourseLimit.get(Concentration.Software_Engineering) - 1);
                    System.out.println("Enrolled " + StudentName + " to " + Concentration.Software_Engineering.toString());
                    break;
                case Programming_Langauges:
                    CourseLimit.put(Concentration.Programming_Langauges, CourseLimit.get(Concentration.Programming_Langauges) - 1);
                    System.out.println("Enrolled " + StudentName + " to " + Concentration.Programming_Langauges.toString());
                    break;
            }
            return true;
        }
        if(Enroll = false) {
            switch (Course) {
                case Databases:
                    CourseLimit.put(Concentration.Databases, CourseLimit.get(Concentration.Databases) + 1);
                    if(!StudentWaitListDatabases.isEmpty()) {
                        System.out.println("invoking enroll again for " + StudentWaitListDatabases.get(0));
                        CourseEnrollORDrop(StudentWaitListDatabases.get(0), Concentration.Databases, true);
                    }
                    break;
                case Systems:
                    CourseLimit.put(Concentration.Systems, CourseLimit.get(Concentration.Systems) + 1);
                    if(!StudentWaitListSystems.isEmpty()) {
                        CourseEnrollORDrop(StudentWaitListSystems.get(0), Concentration.Systems, true);
                    }
                    break;
                case Software_Engineering:
                    CourseLimit.put(Concentration.Software_Engineering, CourseLimit.get(Concentration.Software_Engineering) + 1);
                    if(!StudentWaitListSoftware_Engineering.isEmpty()) {
                        CourseEnrollORDrop(StudentWaitListSoftware_Engineering.get(0), Concentration.Software_Engineering, true);
                    }
                    break;
                case Programming_Langauges:
                    CourseLimit.put(Concentration.Programming_Langauges, CourseLimit.get(Concentration.Programming_Langauges) + 1);
                    if(!StudentWaitListProgramming_Langauges.isEmpty()) {
                        CourseEnrollORDrop(StudentWaitListProgramming_Langauges.get(0), Concentration.Programming_Langauges, true);
                    }
                    break;
            }
            return true;
        }
        return true;
    }

    public String format() {
        //return html format of the course.
        return "html";
    }


}
