package ac.university.collegeApplication.entity;

import lombok.Data;

import javax.persistence.*;
@Entity
public class Professor {
    @Id
    private String professorId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String conatactNumber;

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
        return "Professor{" +
                "professorId='" + professorId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", conatactNumber='" + conatactNumber + '\'' +
                ", primaryDepartment=" + primaryDepartment +
                ", secondaryDepartment=" + secondaryDepartment +
                '}';
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "primary_department_id", nullable = false)
    private Department primaryDepartment;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "secondary_department_id", nullable = false)
    private Department secondaryDepartment;
}
