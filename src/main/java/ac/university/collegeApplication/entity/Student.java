package ac.university.collegeApplication.entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Entity
public class Student {
    @Id
    private String studentId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String conatactNumber;
    private int semester;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentSubject> subjectList = new ArrayList<>();

    public void addSubject(Subject subject) {
        StudentSubject studentSubject = new StudentSubject(this, subject);
        subjectList.add(studentSubject);
        subject.getStudentSubjectList().add(studentSubject);

    }

    public void removeSubject(Subject subject) {
        for (Iterator<StudentSubject> iterator = subjectList.iterator();
             iterator.hasNext(); ) {
                StudentSubject studentSubject = iterator.next();

            if (studentSubject.getStudent().equals(this) &&
                    studentSubject.getSubject().equals(subject)) {
                iterator.remove();
                studentSubject.getSubject().getStudentSubjectList().remove(studentSubject);
                studentSubject.setStudent(null);
                studentSubject.setSubject(null);
            }
        }
    }
}
