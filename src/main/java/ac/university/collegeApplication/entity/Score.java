package ac.university.collegeApplication.entity;


import javax.persistence.*;

@Entity
public class Score {
    @Id
    private  String MarksId;

    @ManyToOne
    @JoinColumn(name = "student_ref_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_ref_id")
    private Subject subject;

    private int marks;

    public String getMarksId() {
        return MarksId;
    }

    public void setMarksId(String marksId) {
        MarksId = marksId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
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

    public Score() {
    }
}

// get student
// get subject

//studentSubject : compositer
 //  set other fields6
