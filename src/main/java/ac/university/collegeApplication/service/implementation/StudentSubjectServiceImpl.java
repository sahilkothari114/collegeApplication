package ac.university.collegeApplication.service.implementation;

import ac.university.collegeApplication.entity.Student;
import ac.university.collegeApplication.entity.StudentSubject;
import ac.university.collegeApplication.repository.StudentSubjectRepository;
import ac.university.collegeApplication.service.StudentSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentSubjectServiceImpl implements StudentSubjectService {
@Autowired
    StudentSubjectRepository studentSubjectRepository;
    @Override
    public StudentSubject addSubject(StudentSubject studentSubject) {
        return studentSubjectRepository.save(studentSubject);
    }

    @Override
    public List<StudentSubject> findAll() {
        List<StudentSubject> studentSubjectList = new ArrayList<>();
        studentSubjectRepository.findAll().forEach(studentSubjectList::add);
        return studentSubjectList;

    }


}
