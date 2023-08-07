package cs655.Term_Project.General;

import java.util.ArrayList;

public class Certification extends CSDepartment {

    ArrayList<String> CertificationTrack;  //Cert program list

    public Certification(ArrayList<String> certificationTrack) {
        CertificationTrack = certificationTrack;
    }

    public ArrayList<String> getCertificationTrack() {
        return CertificationTrack;
    }

    public void setCertificationTrack(ArrayList<String> certificationTrack) {
        CertificationTrack = certificationTrack;
    }
}
