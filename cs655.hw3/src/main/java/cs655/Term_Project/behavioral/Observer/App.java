package cs655.Term_Project.behavioral.Observer;

public class App {
    public static void main(String[] args) {

        CSDepartment CSDept = new CSDepartment();
        CSDept.setDeptName("Computer Science");
        UnderGradDegree UG = new UnderGradDegree("UnderGrad");
        PostGradDegree PG = new PostGradDegree("PostGrad");
        CertificationProgram CertPGM = new CertificationProgram("CertPGM");

        /*
            The below code snippet simulates course enrollment by one student and also artificially increases the student
            enrollment to be higher than the limit. This in-turn triggers a notification to the Chairperson.
         */
        System.out.println();
        System.out.println("Implementing Observer Design Pattern");
        System.out.println("*********");
        Courses enroll = new Courses();
        enroll.CourseEnrollORDrop("Messi", Concentration.Databases,1,Alerts.Enrollment_Limit,
                new ChairPersonListener("ChairPerson"));
        ChairPersonListener EnrollLimit = new ChairPersonListener("Limit_Reached");
        EnrollLimit.setLimit(4);
        if(EnrollLimit.getLimit()>3) {
            enroll.EnrollmentLimitReached();
            enroll.CourseLimit.put(Concentration.Databases,0);
        }
        enroll.CourseEnrollORDrop("Ronaldo", Concentration.Databases,1, Alerts.Enrollment_Limit,
                new ChairPersonListener("ChairPerson"));

        enroll.CourseEnrollORDrop("Messi", Concentration.Databases,0, Alerts.Enrollment_Limit,
                new ChairPersonListener("ChairPerson"));
        System.out.println("*********");

    }
}
