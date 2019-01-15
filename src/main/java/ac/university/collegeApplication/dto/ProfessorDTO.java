package ac.university.collegeApplication.dto;

import javax.persistence.Id;

public class ProfessorDTO {

    public ProfessorDTO() {

    }

    public ProfessorDTO(String professorId, String firstName, String lastName, String emailId, String conatactNumber) {
        this.professorId = professorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.conatactNumber = conatactNumber;
    }

    private String professorId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String conatactNumber;
    private DepartmentDTO primaryDepartmentDTO;
    private DepartmentDTO secondaryDepartmentDTO;

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

    public DepartmentDTO getPrimaryDepartmentDTO() {
        return primaryDepartmentDTO;
    }

    public void setPrimaryDepartmentDTO(DepartmentDTO primaryDepartmentDTO) {
        this.primaryDepartmentDTO = primaryDepartmentDTO;
    }

    public DepartmentDTO getSecondaryDepartmentDTO() {
        return secondaryDepartmentDTO;
    }

    public void setSecondaryDepartmentDTO(DepartmentDTO secondaryDepartmentDTO) {
        this.secondaryDepartmentDTO = secondaryDepartmentDTO;
    }

    @Override
    public String toString() {
        return "ProfessorDTO{" +
                "professorId='" + professorId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", conatactNumber='" + conatactNumber + '\'' +
                ", primaryDepartmentDTO=" + primaryDepartmentDTO +
                ", secondaryDepartmentDTO=" + secondaryDepartmentDTO +
                '}';
    }
}
