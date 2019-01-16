package ac.university.collegeApplication.service.implementation;

import ac.university.collegeApplication.entity.Student;
import ac.university.collegeApplication.entity.Subject;
import ac.university.collegeApplication.repository.StudentRepository;
import ac.university.collegeApplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student add(Student student) {
        return  studentRepository.save(student);

    }

    @Override
    public Student findOne(String studentId) {
        return studentRepository.findOne(studentId);
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public void addSubject(Student student) {
        studentRepository.save(student);
    }
}
