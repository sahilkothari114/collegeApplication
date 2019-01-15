package ac.university.collegeApplication.service.implementation;

import ac.university.collegeApplication.entity.Student;
import ac.university.collegeApplication.entity.StudentSubject;
import ac.university.collegeApplication.service.StudentSubjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSubjectServiceImpl implements StudentSubjectService {

    @Override
    public void addSubject(StudentSubject studentSubject) {

    }

    @Override
    public List<StudentSubject> findSubjectByStudent(Student student) {
        return null;
    }
}
