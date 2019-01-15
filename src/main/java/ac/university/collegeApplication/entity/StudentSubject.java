package ac.university.collegeApplication.entity;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class StudentSubject {
    @EmbeddedId
    private StudentSubjectID studentSubjectID;

    @ManyToOne
    @MapsId("studentId")
    private Student student;

    @ManyToOne
    @MapsId("subjectId")
    private Subject subject;

    public StudentSubject() {
    }

    private int marks;

    public StudentSubject(Student student, Subject subject) {
        this.student = student;
        this.subject = subject;
        this.studentSubjectID = new StudentSubjectID(student.getStudentId(),subject.getSubjectId());
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
