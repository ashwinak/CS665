package cs655.Term_Project.common_NoPattern;

public class App {
    public static void main(String[] args) {

        CSDepartment CSDept = new CSDepartment();
        CSDept.setDeptName("Computer Science");
        System.out.println();
        System.out.println("******Show Faculty Info******");
        System.out.println(CSDept.getFacultyInfo());

        System.out.println();
        System.out.println("******Show UnderGrad Requirements******");
        UnderGradDegree UG = new UnderGradDegree("UnderGrad");
        System.out.println(UG.getUnderGrad().get("CIS"));

        System.out.println();
        System.out.println("******Show PostGrad Requirements******");
        PostGradDegree PG = new PostGradDegree("PostGrad");
        System.out.println(PG.getPostGrad().get("CS"));

        System.out.println();
        System.out.println("******Show Certificate Program Requirements******");
        CertificationProgram CertPGM = new CertificationProgram("CertPGM");
        System.out.println(CertPGM.getCertProgram().get("Security"));

        System.out.println();
        System.out.println("******Show Course Map Concentration******");
        System.out.println(CSDept.getCourseMapConc());

        System.out.println();
        System.out.println("******Show Course Map SubConcentration******");
        System.out.println(CSDept.getCourseMapSubConc());

        System.out.println();
        System.out.println("******Show Course ChairPerson Info******");
        System.out.println(CSDept.getCourseChairPersonFaculty());

        System.out.println();
        System.out.println("******Show Course Full Time Faculty Info******");
        System.out.println(CSDept.getCourseFullTimeFaculty());

        System.out.println();
        System.out.println("******Show Student Info******");
        CSDept.getCourseInfo();
        System.out.println(CSDept.getStudentInfo());

        System.out.println();
        System.out.println("******Show Faculty CourseList******");
        System.out.println(CSDept.getFacultyCourseList());

        System.out.println();
        System.out.println("******Show CourseList Per Semester******");
        System.out.println(CSDept.getCourseListPerSememster());

        System.out.println();
        System.out.println("******Show CourseList Per Course******");
        System.out.println(CSDept.getStudentEnrolledPerCourse());

        System.out.println();
        System.out.println("******Show Student Enroll or Drop******");
        Courses enroll = new Courses();
        enroll.CourseEnrollORDrop("Adam",Concentration.Databases,true);
        enroll.CourseEnrollORDrop("Jack",Concentration.Databases,true);
        enroll.CourseEnrollORDrop("Messi",Concentration.Databases,true);
        enroll.CourseEnrollORDrop("Peter",Concentration.Databases,true);

    }
}
