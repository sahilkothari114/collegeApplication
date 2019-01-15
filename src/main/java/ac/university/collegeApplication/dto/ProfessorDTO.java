package ac.university.collegeApplication.dto;

import javax.persistence.Id;

public class ProfessorDTO {
    private String professorId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String conatactNumber;
    private DepartmentDTO primaryDepartmentDTO;
    private DepartmentDTO secondaryDepartmentDTO;
}
