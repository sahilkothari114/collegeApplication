package ac.university.collegeApplication.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class StudentSubjectID implements Serializable {
    private String studentId;
    private String subjectId;

    public StudentSubjectID() {
    }

    public StudentSubjectID(String studentId, String subjectId) {
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
