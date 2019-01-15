package ac.university.collegeApplication.dto;

import ac.university.collegeApplication.entity.StudentSubject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

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
    private DepartmentDTO department;
    @JsonIgnore
    private List<StudentSubject> subjectList = new ArrayList<>();

    public List<StudentSubject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<StudentSubject> subjectList) {
        this.subjectList = subjectList;
    }

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

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    public StudentDTO(String studentId, String firstName, String lastName, String emailId, String conatactNumber, int semester, DepartmentDTO department, List<StudentSubject> subjectList) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.conatactNumber = conatactNumber;
        this.semester = semester;
        this.department = department;
        this.subjectList = subjectList;
    }



}
