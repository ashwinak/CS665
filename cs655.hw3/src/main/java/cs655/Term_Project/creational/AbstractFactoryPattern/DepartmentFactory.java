package cs655.Term_Project.creational.AbstractFactoryPattern;

public abstract class DepartmentFactory {

    public abstract Degree CreateDegreeProgram(String program);
    public abstract Staff CreateFaculty();

    public abstract Curriculam CreateCourses();

    public abstract StudentProduct CreateStudent();


}
