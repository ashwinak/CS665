package cs655.Term_Project.General;

public class CSDepartment implements Department {

    String DeptName = "CSDepartment";
    String DegreeType;
    String CertificateName;

    public CSDepartment(String deptName, String degreeType, String certificateName) {
        DeptName = deptName;
        DegreeType = degreeType;
        CertificateName = certificateName;
    }

    public CSDepartment() {

    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public String getDegreeType() {
        return DegreeType;
    }

    public void setDegreeType(String degreeType) {
        DegreeType = degreeType;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String certificateName) {
        CertificateName = certificateName;
    }

    @Override
    public void DepartmentName(String DeptName) {

    }

    @Override
    public void DegreeInfo(String DegreeType) {

    }

    @Override
    public void CertificationInfo(String CertificateName) {

    }
}
