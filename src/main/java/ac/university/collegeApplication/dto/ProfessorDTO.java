package ac.university.collegeApplication.dto;

import ac.university.collegeApplication.entity.Department;
import ac.university.collegeApplication.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Id;

public class ProfessorDTO {

    @Autowired
    DepartmentService departmentService;
    public ProfessorDTO() {

    }


    private String professorId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String conatactNumber;
    private String primaryDepartmentId;
    private String secondaryDepartmentId;

    public ProfessorDTO(String professorId, String firstName, String lastName, String emailId, String conatactNumber, String primaryDepartmentId, String secondaryDepartmentId) {
        this.professorId = professorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.conatactNumber = conatactNumber;
        this.primaryDepartmentId = primaryDepartmentId;
        this.secondaryDepartmentId = secondaryDepartmentId;
        this.primaryDepartment=departmentService.select(primaryDepartmentId);
        this.secondaryDepartment=departmentService.select(secondaryDepartmentId);
    }

    private Department primaryDepartment;
    private Department secondaryDepartment;

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

    public String getConatactNumber() {
        return conatactNumber;
    }

    public void setConatactNumber(String conatactNumber) {
        this.conatactNumber = conatactNumber;
    }

    public Department getPrimaryDepartment() {
        return primaryDepartment;
    }

    public void setPrimaryDepartment(Department primaryDepartment) {
        this.primaryDepartment = primaryDepartment;
    }

    public Department getSecondaryDepartment() {
        return secondaryDepartment;
    }

    public void setSecondaryDepartment(Department secondaryDepartment) {
        this.secondaryDepartment = secondaryDepartment;
    }

    @Override
    public String toString() {
        return "ProfessorDTO{" +
                "professorId='" + professorId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", conatactNumber='" + conatactNumber + '\'' +
                ", primaryDepartment=" + primaryDepartment +
                ", secondaryDepartment=" + secondaryDepartment +
                '}';
    }
}
