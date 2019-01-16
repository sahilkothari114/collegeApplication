package ac.university.collegeApplication.dto;

import ac.university.collegeApplication.entity.Student;
import ac.university.collegeApplication.entity.Subject;
import org.springframework.data.annotation.Id;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ScoreDTO {
    @Id
    private  String MarksId;

    private Student student;

    private Subject subject;

    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getMarksId() {
        return MarksId;
    }

    public void setMarksId(String marksId) {
        MarksId = marksId;
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
}
