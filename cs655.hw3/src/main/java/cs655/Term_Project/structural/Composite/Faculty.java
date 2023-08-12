package cs655.Term_Project.structural.Composite;

public class Faculty extends CSDepartment {

    String Chairperson;
    String FullTimeFaculty;
    String FullTimeUGAdvisor;
    String FullTimePGAdvisor;
    String PartTimeFaculty;


    public Faculty(String chairperson, String fullTimeFaculty, String fullTimeUGAdvisor, String fullTimePGAdvisor, String partTimeFaculty) {
        super();
        Chairperson = chairperson;
        FullTimeFaculty = fullTimeFaculty;
        FullTimeUGAdvisor = fullTimeUGAdvisor;
        FullTimePGAdvisor = fullTimePGAdvisor;
        PartTimeFaculty = partTimeFaculty;
    }

    public Faculty(String deptName, String degreeType, String certificateName, String chairperson, String fullTimeFaculty, String fullTimeUGAdvisor, String fullTimePGAdvisor, String partTimeFaculty) {
        super(deptName, degreeType, certificateName);
        Chairperson = chairperson;
        FullTimeFaculty = fullTimeFaculty;
        FullTimeUGAdvisor = fullTimeUGAdvisor;
        FullTimePGAdvisor = fullTimePGAdvisor;
        PartTimeFaculty = partTimeFaculty;
    }

    public Faculty() {

    }

    public String getChairperson() {
        return Chairperson;
    }

    public String setChairperson(String chairperson) {
        Chairperson = chairperson;
        return Chairperson;
    }

    public String getFullTimeFaculty() {
        return FullTimeFaculty;
    }

    public String setFullTimeFaculty(String fullTimeFaculty) {
        FullTimeFaculty = fullTimeFaculty;
        return FullTimeFaculty;
    }

    public String getFullTimeUGAdvisor() {
        return FullTimeUGAdvisor;
    }

    public String setFullTimeUGAdvisor(String fullTimeUGAdvisor) {
        FullTimeUGAdvisor = fullTimeUGAdvisor;
        return FullTimeUGAdvisor;
    }

    public String getFullTimePGAdvisor() {
        return FullTimePGAdvisor;
    }

    public String setFullTimePGAdvisor(String fullTimePGAdvisor) {
        FullTimePGAdvisor = fullTimePGAdvisor;
        return FullTimePGAdvisor;
    }

    public String getPartTimeFaculty() {
        return PartTimeFaculty;
    }

    public String setPartTimeFaculty(String partTimeFaculty) {
        PartTimeFaculty = partTimeFaculty;
        return PartTimeFaculty;
    }
}
