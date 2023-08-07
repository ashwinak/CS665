package cs655.Term_Project.General;

import java.util.ArrayList;

public class Faculty extends CSDepartment {

    String Chairperson;
    String FullTimeFaculty;

    String FullTimeUGAdvisor;
    String FullTimePGAdvisor;

    public Faculty(String chairperson, String fullTimeFaculty, String fullTimeUGAdvisor, String fullTimePGAdvisor, String partTimeFaculty) {
        super();
        Chairperson = chairperson;
        FullTimeFaculty = fullTimeFaculty;
        FullTimeUGAdvisor = fullTimeUGAdvisor;
        FullTimePGAdvisor = fullTimePGAdvisor;
        PartTimeFaculty = partTimeFaculty;
    }

    public String getChairperson() {
        return Chairperson;
    }

    public void setChairperson(String chairperson) {
        Chairperson = chairperson;
    }

    public String getFullTimeFaculty() {
        return FullTimeFaculty;
    }

    public void setFullTimeFaculty(String fullTimeFaculty) {
        FullTimeFaculty = fullTimeFaculty;
    }

    public String getFullTimeUGAdvisor() {
        return FullTimeUGAdvisor;
    }

    public void setFullTimeUGAdvisor(String fullTimeUGAdvisor) {
        FullTimeUGAdvisor = fullTimeUGAdvisor;
    }

    public String getFullTimePGAdvisor() {
        return FullTimePGAdvisor;
    }

    public void setFullTimePGAdvisor(String fullTimePGAdvisor) {
        FullTimePGAdvisor = fullTimePGAdvisor;
    }

    public String getPartTimeFaculty() {
        return PartTimeFaculty;
    }

    public void setPartTimeFaculty(String partTimeFaculty) {
        PartTimeFaculty = partTimeFaculty;
    }

    String PartTimeFaculty;






}
