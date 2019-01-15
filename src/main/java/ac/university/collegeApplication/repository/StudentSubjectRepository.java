package ac.university.collegeApplication.repository;

import ac.university.collegeApplication.entity.Student;
import ac.university.collegeApplication.entity.StudentSubject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentSubjectRepository extends CrudRepository<StudentSubject,String> {
    List<StudentSubject> findSubjectByStudent(Student student);

}
