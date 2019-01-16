package ac.university.collegeApplication.dto;

import ac.university.collegeApplication.entity.Department;
import ac.university.collegeApplication.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Id;

public class ProfessorDTO {

     public ProfessorDTO() {

    }

    private String professorId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String contactNumber;
    private String primaryDepartmentId;
    private String secondaryDepartmentId;



    public String getPrimaryDepartmentId() {
        return primaryDepartmentId;
    }

    public void setPrimaryDepartmentId(String primaryDepartmentId) {
        this.primaryDepartmentId = primaryDepartmentId;
    }

    public String getSecondaryDepartmentId() {
        return secondaryDepartmentId;
    }

    public void setSecondaryDepartmentId(String secondaryDepartmentId) {
        this.secondaryDepartmentId = secondaryDepartmentId;
    }


    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "ProfessorDTO{" +
                "professorId='" + professorId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", primaryDepartmentId='" + primaryDepartmentId + '\'' +
                ", secondaryDepartmentId='" + secondaryDepartmentId + '\'' +
                '}';
    }
}
