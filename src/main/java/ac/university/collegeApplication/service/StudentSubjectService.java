package ac.university.collegeApplication.service;

import ac.university.collegeApplication.entity.Student;
import ac.university.collegeApplication.entity.StudentSubject;

import java.util.List;

public interface StudentSubjectService {
    void addSubject(StudentSubject studentSubject);
    List<StudentSubject> findSubjectByStudent(Student student);
}
