package ac.university.collegeApplication.dto;

import ac.university.collegeApplication.entity.StudentSubject;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class SubjectDTO {
    public SubjectDTO() {
    }

    public SubjectDTO(String subjectId, String subjectName, int semester, int credits) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.semester = semester;
        this.credits = credits;
    }

    private String subjectId;
    private String subjectName;
    private int semester;
    private int credits;
    private DepartmentDTO department;
    @JsonIgnore
    List<StudentSubject> studentSubjectList = new ArrayList<>();

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    public List<StudentSubject> getStudentSubjectList() {
        return studentSubjectList;
    }

    public void setStudentSubjectList(List<StudentSubject> studentSubjectList) {
        this.studentSubjectList = studentSubjectList;
    }


}
