package ac.university.collegeApplication.dto;

import java.io.Serializable;

public class StudentSubjectIDDTO implements Serializable {
    private String studentId;
    private String subjectId;

    public StudentSubjectIDDTO() {
    }

    public StudentSubjectIDDTO(String studentId, String subjectId) {
        this.studentId = studentId;
        this.subjectId = subjectId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }
}
