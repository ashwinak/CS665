package cs655.Term_Project.creational.AbstractFactoryPattern;

import java.util.List;

public class App {
    public static void main(String[] args) {


       /*
        The below code snippet implements abstract factory design pattern to create factory of departments. One of the department is CSDepartment.
        In future this code is extensible to create more factory departments like Electronics department, Computer engineering department.
        */

        System.out.println();
        System.out.println("#### Implementing Abstract factory design pattern");
        System.out.println("--Creating Degree Programs--");
        DepartmentFactory CS = new CSDepartmentFactory();
        Degree createCert = CS.CreateDegreeProgram("Cert");
        System.out.println(createCert.toString());
        Degree createUGD = CS.CreateDegreeProgram("UGD");
        System.out.println(createUGD.toString());
        Degree createPGD = CS.CreateDegreeProgram("PGD");
        System.out.println(createPGD.toString());

        System.out.println();
        System.out.println("--Creating Department Staff--");
        Staff CSStaff = CS.CreateFaculty();
        System.out.println(CSStaff.toString());

        System.out.println();
        System.out.println("--Creating Department Curricular--");
        Curriculam CSCurriculam  = CS.CreateCourses();
        System.out.println(CSCurriculam.toString());

        System.out.println();
        System.out.println("--Creating Department Students--");
        StudentProduct CSStudents  = CS.CreateStudent();
        System.out.println(CSStudents.toString());

        CSDepartmentFactory CSDept = new CSDepartmentFactory();
        CSDept.setDeptName("Computer Science");
        System.out.println();


        /*
        The below code snippet implements proxy pattern to retrive data from the DB. The first time an object request for data,
        it is served fresh from the sever. Subsequent request using the same object make use of the cache implemented via the proxy class.
        */

        System.out.println("#### Implementing Proxy Design Pattern with Singleton design pattern.");

        /*
            The code below uses the singleton instance of CourseStudentListProxyImpl object inside CourseStudentListProxy class
            and singleton instance of CourseStudentListProxy object in the runner main class.
            This code snippet implements singleton design pattern.

         */

        CSDeptDB list1 = CourseStudentListProxy.getInstance("Singleton");
        //Triggering fresh copy for the first time. i.e download data from DB.
        list1.process();

        // Using cached data.
        list1.process();

        /*
            The below code snippet implements strategy pattern to calculate GPA. Right now, this implements only one algorithm.
            But this code is extensible to add more calculator algorithms at will without modifications to existing non-main classes.
            Here the students() class is a GPA strategy class that implements Calculator Strategy Class.

         */

        Integer Score = 94;
        System.out.println();
        System.out.println("#### Implementing Strategy Design Pattern");
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
        System.out.println("#### Implementing Observer Design Pattern");
        System.out.println("*********");
        Courses enroll = new Courses();
        enroll.CourseEnrollORDrop("Messi", Concentration.Databases,1, Alerts.Enrollment_Limit,
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

        /*
            Print html format of courses and syllabus of courses, sub concentration and its courses using the composite design pattern.
       */

        System.out.println();
        System.out.println("#### Implementing Composite Design Pattern");
        System.out.println("*********");

        CourseSyllabus CS1 = new CourseSyllabus(Concentration.Databases.toString(), Concentration.Databases.toString());
        CourseSyllabus CS2 = new CourseSyllabus(Concentration.Systems.toString(), Concentration.Systems.toString());

        SubConcentration SubCS = new SubConcentration();
        SubCS.addContent(CS1);
        SubCS.addContent(CS2);

        CourseDescription CD1 = new CourseDescription(Concentration.Databases.toString(), Concentration.Databases.toString());
        CourseDescription CD2 = new CourseDescription(Concentration.Systems.toString(), Concentration.Systems.toString());

        SubConcentration SubCD = new SubConcentration();
        SubCD.addContent(CD1);
        SubCD.addContent(CD2);

        SubConcentration PrintHTML = new SubConcentration();
        PrintHTML.addContent(SubCS);
        PrintHTML.addContent(SubCD);

        PrintHTML.showHTMLFormat();
        System.out.println("*********");



    }
}
