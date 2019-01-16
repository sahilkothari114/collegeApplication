package ac.university.collegeApplication.dto;

import ac.university.collegeApplication.entity.Score;
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

    private String studentId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String conatactNumber;
    private int semester;
    private DepartmentDTO department;
    private List<ScoreDTO>  scoreList = new ArrayList<>();

    public boolean add(ScoreDTO scoreDTO) {
        return getScoreList().add(scoreDTO);
    }

    public ScoreDTO get(int index) {
        return getScoreList().get(index);
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

    public List<ScoreDTO> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<ScoreDTO> scoreList) {
        this.scoreList = scoreList;
    }
}
