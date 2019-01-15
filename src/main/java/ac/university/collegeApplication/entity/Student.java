package ac.university.collegeApplication.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<StudentSubject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<StudentSubject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", conatactNumber='" + conatactNumber + '\'' +
                ", semester=" + semester +
                ", department=" + department +
                ", subjectList=" + subjectList +
                '}';
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "department_id", nullable = false)
    @JsonIgnore
    private Department department;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
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
