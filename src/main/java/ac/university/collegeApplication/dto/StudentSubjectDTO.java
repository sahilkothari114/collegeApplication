package ac.university.collegeApplication.dto;




import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

public class StudentSubjectDTO {
    @JsonIgnore
    private StudentSubjectIDDTO studentSubjectID;

    private StudentDTO student;


    private StudentDTO subject;

    public StudentSubjectDTO() {
    }

    private int marks;

    public StudentSubjectDTO(StudentSubjectIDDTO studentSubjectID, StudentDTO student, StudentDTO subject, int marks) {
        this.studentSubjectID = studentSubjectID;
        this.student = student;
        this.subject = subject;
        this.marks = marks;
    }

    public StudentSubjectIDDTO getStudentSubjectID() {
        return studentSubjectID;
    }

    public void setStudentSubjectID(StudentSubjectIDDTO studentSubjectID) {
        this.studentSubjectID = studentSubjectID;
    }

    public StudentDTO getStudent() {
        return student;
    }

    public void setStudent(StudentDTO student) {
        this.student = student;
    }

    public StudentDTO getSubject() {
        return subject;
    }

    public void setSubject(StudentDTO subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
