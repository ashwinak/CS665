package cs655.Term_Project.structural.Composite;

public class App {
    public static void main(String[] args) {

        CSDepartment CSDept = new CSDepartment();
        CSDept.setDeptName("Computer Science");
        UnderGradDegree UG = new UnderGradDegree("UnderGrad");
        PostGradDegree PG = new PostGradDegree("PostGrad");
        CertificationProgram CertPGM = new CertificationProgram("CertPGM");

        /*
            The below code snippet implements strategy pattern to calculate GPA. Right now, this implements only one algorithm.
            But this code is extensible to add more calculator algorithms at will without modifications to existing non-main classes.
            Here the students() class is a GPA strategy class that implements Calculator Strategy Class.

         */

        Integer Score = 94;
        System.out.println();
        System.out.println("Implementing Strategy Design Pattern");
        System.out.println("*********");
        GPAService CalcGPA = new GPAService();
        System.out.println("Using GPA Calculator Strategy");
        System.out.println("The calculated GPA for the score " + Score + " is " +CalcGPA.getGPA(new Students(),Score));
        System.out.println("*********");

        /*
            The below code snippet simulates course enrollment by one student and also artifically increases the student
            enrollment to be higher than the limit. This inturn triggers a notification to the Chairperson. A new enrollment
            at this stage will be in the waitlist queue. When some one drops from the course, the first student from the waitlist will be
            allowed autoenroll to the class. This one is using the observer pattern.
         */

        System.out.println();
        System.out.println("Implementing Observer Design Pattern");
        System.out.println("*********");
        Courses enroll = new Courses();
        enroll.CourseEnrollORDrop("Messi",Concentration.Databases,1,Alerts.Enrollment_Limit,
                new ChairPersonListener("ChairPerson"));
        ChairPersonListener EnrollLimit = new ChairPersonListener("Limit_Reached");
        EnrollLimit.setLimit(4);
        if(EnrollLimit.getLimit()>3) {
            enroll.EnrollmentLimitReached();
            enroll.CourseLimit.put(Concentration.Databases,0);
        }
        enroll.CourseEnrollORDrop("Ronaldo",Concentration.Databases,1,Alerts.Enrollment_Limit,
                new ChairPersonListener("ChairPerson"));

        enroll.CourseEnrollORDrop("Messi",Concentration.Databases,0,Alerts.Enrollment_Limit,
                new ChairPersonListener("ChairPerson"));
        System.out.println("*********");

        /*
            Print html format of courses and syllabus
       */

        System.out.println();
        System.out.println("Implementing Composite Design Pattern");
        System.out.println("*********");

        CourseSyllabus CS1 = new CourseSyllabus(Concentration.Databases.toString());
        CourseSyllabus CS2 = new CourseSyllabus(Concentration.Systems.toString());
        CourseSyllabus CS3 = new CourseSyllabus(Concentration.Software_Engineering.toString());

        CourseSyllabus CS4 = new CourseSyllabus(Concentration.Programming_Langauges.toString());
        SubConcentration SubCS = new SubConcentration();
        SubCS.addContent(new CourseSyllabus(Concentration.Functional_Langauges.toString()));
        SubCS.addContent(new CourseSyllabus(Concentration.Object_Oriented_Langauges.toString()));
        SubCS.addContent(new CourseSyllabus(Concentration.Procedural_Langauges.toString()));


        CourseDescription CD1 = new CourseDescription(Concentration.Databases.toString());
        CourseDescription CD2 = new CourseDescription(Concentration.Systems.toString());
        CourseDescription CD3 = new CourseDescription(Concentration.Software_Engineering.toString());

        CourseDescription CD4 = new CourseDescription(Concentration.Programming_Langauges.toString());
        SubConcentration SubCD = new SubConcentration();
        SubCD.addContent(new CourseDescription(Concentration.Functional_Langauges.toString()));
        SubCD.addContent(new CourseDescription(Concentration.Object_Oriented_Langauges.toString()));
        SubCD.addContent(new CourseDescription(Concentration.Procedural_Langauges.toString()));

        SubConcentration PrintHTML = new SubConcentration();

        //Printing leaf level course description and Syllabus
        PrintHTML.addContent(CS1);
        PrintHTML.addContent(CS2);
        PrintHTML.addContent(CS3);

        PrintHTML.addContent(CD1);
        PrintHTML.addContent(CD2);
        PrintHTML.addContent(CD3);

        //Printing sub concentration course description and Syllabus
        PrintHTML.addContent(SubCS);
        PrintHTML.addContent(SubCD);

        PrintHTML.showHTMLFormat();
        System.out.println("*********");



    }
}
