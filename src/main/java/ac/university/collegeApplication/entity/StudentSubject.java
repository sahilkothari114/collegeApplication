package ac.university.collegeApplication.entity;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
@Data
public class StudentSubject {
    @EmbeddedId
    private StudentSubjectID studentSubjectID;

    @ManyToOne
    @MapsId("studentId")
    private Student student;

    @ManyToOne
    @MapsId("subjectId")
    private Subject subject;

    private int marks;

    public StudentSubject(Student student, Subject subject) {
        this.student = student;
        this.subject = subject;
    }

    public StudentSubjectID getStudentSubjectID() {
        return studentSubjectID;
    }

    public void setStudentSubjectID(StudentSubjectID studentSubjectID) {
        this.studentSubjectID = studentSubjectID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
