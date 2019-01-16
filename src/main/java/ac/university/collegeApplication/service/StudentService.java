package ac.university.collegeApplication.service;


import ac.university.collegeApplication.entity.Student;
import ac.university.collegeApplication.entity.Subject;

import java.util.List;

public interface StudentService {
    Student add(Student student);
    Student findOne(String studentId);
    List<Student> findAll();
    void delete(Student student);
    void addSubject(Student student);
    double findAvgMarksCurrentSem(String studentid,String semester);
}
