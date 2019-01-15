package ac.university.collegeApplication.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

public class StudentDTO {
    private String studentId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String conatactNumber;
    private int semester;
    private DepartmentDTO departmentDTO;
}
