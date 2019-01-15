package ac.university.collegeApplication.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

public class StudentDTO {
    public StudentDTO() {
    }

    public StudentDTO(String studentId, String firstName, String lastName, String emailId, String conatactNumber, int semester) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.conatactNumber = conatactNumber;
        this.semester = semester;
    }

    private String studentId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String conatactNumber;
    private int semester;
    private DepartmentDTO departmentDTO;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getConatactNumber() {
        return conatactNumber;
    }

    public void setConatactNumber(String conatactNumber) {
        this.conatactNumber = conatactNumber;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public DepartmentDTO getDepartmentDTO() {
        return departmentDTO;
    }

    public void setDepartmentDTO(DepartmentDTO departmentDTO) {
        this.departmentDTO = departmentDTO;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", conatactNumber='" + conatactNumber + '\'' +
                ", semester=" + semester +
                ", departmentDTO=" + departmentDTO +
                '}';
    }

}
